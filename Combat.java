import java.util.*;
import java.lang.*;

public class Combat{

    public static void start(){
	Software mysoftware;
	Software enemysoftware;
	Global.mysoftware = Repository.info(0);
	Global.enemysoftware = People.Software[0];
	System.out.println("Go "+ Global.mysoftware + " go!");
	System.out.println(Global.name+ " has launched " + Global.enemysoftware + "!");
	mysoftware = new Software();
	enemysoftware = new Software();
	mysoftware.create(Repository.info(0));
	int myhp = mysoftware.gethp();
	int mylen = mysoftware.attackslength();
	String[] myattacks = mysoftware.getattacks();
	enemysoftware.create(People.Software[0]);
	int enemyhp = enemysoftware.gethp();
	int enemylen = enemysoftware.attackslength();
	String[] enemtattacks = enemysoftware.getattacks();

	Scanner response = new Scanner(System.in);
	String command = "";
	while(Global.gamestate==2){
	    command = response.nextLine();
	    command = command.toLowerCase();
	    int index = command.indexOf(" ");
	    String[] word = {command.substring(0, index), command.substring(index+1)};
	    boolean attackstate = false;
		if(word[0].equals("use")){
		    for(int i = 0; i<mylen; i++){
			if (word[1].equals(myattacks[i])){
			    Attack.define(word[1]);
			    enemyhp = enemyhp - Attack.Damage;
			    System.out.println(Global.mysoftware + " used " + word[1] + " for " + Attack.Damage + " damage.");
			    attackstate = true;
			    
			}
		    }
		}
		if(word[0].equals("check") && word[1].equals("health")){
			System.out.println("Current Health");
			System.out.println("Your " + Global.mysoftware + " has " + myhp + " hitpoints remaining."+ "\n" + Global.name +"'s " + Global.enemysoftware + " has " + enemyhp + " hitpoints remaining.");
		    }
		if(word[0].equals("substitute")){
		    for(int i = 0; i<Repository.getsize(); i++){
			if(word[1].equals(Repository.info(i))){
			    Repository.gethealth(word[1]);
			    if(Global.health>0){
				System.out.println(Global.health);
				Repository.addhealth(Global.mysoftware, myhp);
				mysoftware.create(word[1]);
				myhp = Global.health;
				mylen = mysoftware.attackslength();
				myattacks = mysoftware.getattacks();
				Global.mysoftware = word[1];
			    }
			    else{
				System.out.println("software is dead");
			    }
			}
		    }
		}
		if(word[0].equals("list")&&word[1].equals("attacks")){
			for(int i = 0; i<mylen; i++){
			    System.out.println(myattacks[i]);
			}
		    }
		if(attackstate==true){
		    int rndAttack = (int)(Math.random()*enemylen+0);
		    Attack.define(enemysoftware.Attacks[rndAttack]);
		    myhp = myhp - Attack.Damage;
		    System.out.println(Global.enemysoftware + " used " + enemysoftware.Attacks[rndAttack] + " and dealt " + Attack.Damage + " damage to you.");
		}
		if(myhp<=0){
		    Global.gamestate = 0;
		}
		if(enemyhp<=0){
		    Global.gamestate = 1;
		}
	}
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
