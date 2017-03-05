public class Software{

    static String[] Attacks;
    static String[] Weak;
    static String[] Strong;
    static int HP;

    public static int attackslength(){
	return Attacks.length;
    }

    public static int gethp(){
	return HP;
    }

    public static String[] getattacks(){
	return Attacks;
    }

      public Software(){
	String[] attacks = null;
	String[] weak = null;
	String[] strong = null;
	}

    public void create(String software){

	if (software.equals("gnu/linux")){
	    int hp = 25;
	    HP = hp;
	    String[] attacks = {"free software", "package manager"};
	    String[] weak = {};
	    String[] strong = {"free software"};
	    Attacks = attacks;
	    Weak = weak;
	    Strong = strong;

	}
	if (software.equals("emacs")){
	    int hp = 20;
	    HP = hp;
	    String[] attacks = {"text editor", "free software"};
	    String[] weak = {};
	    String[] strong = {"free software"};
	    Attacks = attacks;
	    Weak = weak;
	    Strong = strong;

	}
	if (software.equals("gimp")){
	    int hp = 45;
	    HP = hp;
	    String[] attacks = {"free software", "green pepper","crop"};
	    String[] weak = {};
	    String[] strong = {"free software"};
	    Attacks = attacks;
	    Weak = weak;
	    Strong = strong;

	}
	if (software.equals("libre office")){
	    int hp = 60;
	    HP = hp;
	    String[] attacks = {"free software", "text editor",};
	    String[] weak = {};
	    String[] strong = {"free software"};
	    Attacks = attacks;
	    Weak = weak;
	    Strong = strong;

	}
	if (software.equals("windows 7")){
	    int hp = 22;
	    HP = hp;
	    String[] attacks = {"vendor lockin", "muh games"};
	    String[] weak = {};
	    String[] strong = {"free software"};
	    Attacks = attacks;
	    Weak = weak;
	    Strong = strong;

	}
    if (software.equals("linux kernel")){
	    int hp = 75;
	    HP = hp;
	    String[] attacks = {"GPLv2", "kernel maintainers","kernel panic"};
	    String[] weak = {};
	    String[] strong = {"free software"};
	    Attacks = attacks;
	    Weak = weak;
	    Strong = strong;

	}
    if (software.equals("firefox")){
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
