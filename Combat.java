//Implements combat portion of the game
import java.util.*;

public class Combat{

	//start the combat
    public static void start(){
		
		Scanner response = new Scanner(System.in);
		System.out.println("Choose your Software!");
		Repository.list();
		int choice = Integer.parseInt(response.nextLine());
		
		//initialize combating software
		String mySoftwareName = Repository.getProgramName(choice - 1);
		String enemySoftwareName = People.Software[0];
		Software mysoftware = new Software(mySoftwareName);
		int myhp = mysoftware.gethp();
		int mylen = mysoftware.attackslength();
		String[] myattacks = mysoftware.getattacks();
		Software enemysoftware = new Software(enemySoftwareName);
		int enemyhp = enemysoftware.gethp();
		int enemylen = enemysoftware.attackslength();
		String[] enemyattacks = enemysoftware.getattacks();	
		System.out.println("Go " + mySoftwareName + " go!");
		System.out.println(People.Name + " has launched " + enemySoftwareName + "!");
		String command = "";
		
		//run while both programs are still alive
		while(Global.gamestate==2){
		    command = response.nextLine();
		    command = command.toLowerCase();
		    int index = command.indexOf(" ");
		    String[] word = {command.substring(0, index), command.substring(index+1)}; //break up string command
		    boolean attackstate = false;
		    
		    //Trigger attack usage
			if(word[0].equals("use")){
			    for(int i = 0; i<mylen; i++){
					if (word[1].equals(myattacks[i])){
					    Attack.define(word[1]);
					    enemyhp = enemyhp - Attack.Damage;
					    System.out.println(mySoftwareName + " used " + word[1] + " for " + Attack.Damage + " damage.");
					    attackstate = true;
					}
			    }
			    //If attack does not exists
			    if (attackstate == false){
			    	System.out.println(mySoftwareName + " does not have that attack.");
			    }
			}
		
			//Report current health status
			if(word[0].equals("check") && word[1].equals("health")){
				System.out.println("Current Health");
				System.out.println("Your " + mySoftwareName + " has " + myhp + " hitpoints remaining."+ "\n" + People.Name +"'s " + enemySoftwareName + " has " + enemyhp + " hitpoints remaining.");
			    }
			
			//Swap in a new program
			if(word[0].equals("substitute")){
			    for(int i = 0; i<Repository.getsize(); i++){
					if(word[1].equals(Repository.getProgramName(i))){
					    Repository.gethealth(word[1]);
					    if(Global.health>0){
							System.out.println(Global.health);
							Repository.addhealth(mySoftwareName, myhp);
							mysoftware = new Software(word[1]);
							myhp = Global.health;
							mylen = mysoftware.attackslength();
							myattacks = mysoftware.getattacks();
							mySoftwareName = word[1];
					    }
					    else{
					    	System.out.println("software is dead");
					    }
					}
			    }
			}
			
			//List attacks
			if(word[0].equals("list") && word[1].equals("attacks")){
				for(int i = 0; i<mylen; i++){
				    System.out.println(myattacks[i]);
				}
			}
			
			//Let enemy software attack
			if(attackstate==true){
			    int rndAttack = (int)(Math.random()*enemylen+0);
			    Attack.define(Software.Attacks[rndAttack]);
			    myhp = myhp - Attack.Damage;
			    System.out.println(enemySoftwareName + " used " + Software.Attacks[rndAttack] + " and dealt " + Attack.Damage + " damage to you.");
			}
			if(myhp<=0){
			    Global.gamestate = 0; //ur ded
			}
			if(enemyhp<=0){
			    Global.gamestate = 1; //u win
			}
		}
		response.close();
    }
}
    /*   

    public static void combatProcessor(){
	Scanner response = new Scanner(System.in);
	String command = "";
	while(!command.equals("quit")){
	    command = response.nextLine();
	    combatparser(command);
	}
    }
    
    public static void combatparser(String command){
	//break command into words
	String word  = command.toLowerCase();
	combatphase(word);
	}

    public static void combatphase(String word){
	if(word.equals("choose software")){
	    for(int i = 0; i<Repository.getsize(); i++){
		if (word.equals(Repository.info(0))){
		    mysoftware.create(Repository.info(0));
		    enemysoftware.create(People.Software[0]);
		}
	    }
	}
    }
    }
    */

	    /*    if(word[0].equals("substitute")){
		System.out.println("CHANGE???");
		for(int i = 0; i<Repository.getsize(); i++){
		    if (word[1].equals(Repository.info(0))){
			mysoftware.create(word[1]);
		    }
		}
		else{
		    System.out.println("invalid software");
		}
		}*/
