//Defines a software class to be used during combat
public class Software{

	//static String Name; //Software title
    static String[] Attacks; //attacks that the software can have
    static String[] Weak; //attacks that the software is weak to
    static String[] Strong; //attacks that the software is resilient to
    static int HP; //Software hitpoints

    public int attackslength(){
    	return Attacks.length;
    }

    public int gethp(){
    	return HP;
    }

    public String[] getattacks(){
    	return Attacks;
    }
    
    //Create software based on software title
    public Software(String nm){
    	String Name = nm;

		if (Name.equals("gnu/linux")){
		    int hp = 25;
		    HP = hp;
		    String[] attacks = {"free software", "package manager"};
		    String[] weak = {"muh games"};
		    String[] strong = {"free software"};
		    Attacks = attacks;
		    Weak = weak;
		    Strong = strong;
	
		}
		if (Name.equals("emacs")){
		    int hp = 20;
		    HP = hp;
		    String[] attacks = {"text editor", "free software"};
		    String[] weak = {"GPLv2"};
		    String[] strong = {"free software"};
		    Attacks = attacks;
		    Weak = weak;
		    Strong = strong;
	
		}
		if (Name.equals("gimp")){
		    int hp = 45;
		    HP = hp;
		    String[] attacks = {"free software", "green pepper","crop"};
		    String[] weak = {"it just werks"};
		    String[] strong = {"free software"};
		    Attacks = attacks;
		    Weak = weak;
		    Strong = strong;
	
		}
		if (Name.equals("libre office")){
		    int hp = 60;
		    HP = hp;
		    String[] attacks = {"free software", "text editor",};
		    String[] weak = {"vendor lockin"};
		    String[] strong = {"free software"};
		    Attacks = attacks;
		    Weak = weak;
		    Strong = strong;
	
		}
		if (Name.equals("windows 7")){
		    int hp = 22;
		    HP = hp;
		    String[] attacks = {"vendor lockin", "muh games", "it just werks"};
		    String[] weak = {"free software"};
		    String[] strong = {"it just werks"};
		    Attacks = attacks;
		    Weak = weak;
		    Strong = strong;
	
		}
	    if (Name.equals("linux kernel")){
		    int hp = 75;
		    HP = hp;
		    String[] attacks = {"GPLv2", "kernel maintainers","kernel panic"};
		    String[] weak = {};
		    String[] strong = {"free software"};
		    Attacks = attacks;
		    Weak = weak;
		    Strong = strong;
	
		}
	    if (Name.equals("firefox")){
		    int hp = 50;
		    HP = hp;
		    String[] attacks = {"free software", "cross platform"};
		    String[] weak = {};
		    String[] strong = {"free software"};
		    Attacks = attacks;
		    Weak = weak;
		    Strong = strong;	
		}
    }    
}
