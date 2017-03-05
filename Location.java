public class Location{

    static String[] PplList;
    static String[] exits;

    public static int listlength(){
	return PplList.length;
    }

    public static int exitslength(){
	return exits.length;
    }

    public static void  setlocation(String location){

    	if (location.equals("church of emacs")){
	    String[] peoplelist = {"strange man"};
	    String[] exitlist = {"wooden door", "road1"};
	    PplList = peoplelist;
	    exits = exitlist;
	    Global.info = "You find yourself in a small room. The air smells like whoever lives here hasn't showered for a long time. A strange man who you presume to be the owner of the house is in a corner typing on a small white laptop. Behind you is a wooden door";
	}

	if (location.equals("road1")){
	    String[] peoplelist = {"lug member"};
	    String[] exitlist = {"church of emacs", "church of emacs","east", "road2","lug center", "lug center"};
	    PplList = peoplelist;
	    exits = exitlist;
	    Global.info = "You are standing in the middle of a road. Behind you is the Church of Emacs, in front of you is the Local Linux Users Group (LUG) center. The Road continues to your east. A LUG member is idling on the road." ;
	}


    	if (location.equals("lug center")){
	    String[] peoplelist = {"neckbeard"};
	    String[] exitlist = {"wooden door", "road1"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "You find yourself in a room with a large table in the middle. There is a neckbeard sitting at the table with his thinkpad";
	}

    
	if (location.equals("road2")){
	    String[] peoplelist = {"windows fanboy"};
	    String[] exitlist = {"west", "road1", "linus torvald's house", "linus torvald's house", "software shop", "software shop","east","road3"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "You continue walking on the road. To your north is Linus Torvald's House, to your south is a software shop, and the road continues eastward. You spot a windows fanboy shambling around in the road.";
	}
    
    	if (location.equals("linus torvald's house")){
	    String[] peoplelist = {"linus torvalds"};
	    String[] exitlist = {"door","road2"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "You enter Linus Torvald's house, he is sitty on a blue couch typing on his macbook air. There is a door that leads back to the road that you came from.";
	}
  

    	if (location.equals("software shop")){
	    String[] peoplelist = {};
	    String[] exitlist = {"door","road2"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "You enter the shop. There is a rack of free software on the side. There is a door that leads back to the road that you came from.";
	}
 	if (location.equals("road3")){
	    String[] peoplelist = {};
	    String[] exitlist = {"west","road2","apple store","apple store", "south", "road4"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "You continue walking forwards, In front of you is an apple store, the road makes a sharp turn southwards.";
	}
	if (location.equals("apple store")){
	    String[] peoplelist = {};
	    String[] exitlist = {"glass door","road3"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "you enter the apple store, but there is no sign of free software here. A glass door leads back to the road";
	}
	if (location.equals("road4")){
	    String[] peoplelist = {};
	    String[] exitlist = {"north","road3","best buy","best buy"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "you go down the road, it is a dead end. To your west is a dilapidated looking besy buy";
	}
	if (location.equals("best buy")){
	    String[] peoplelist = {};
	    String[] exitlist = {"door","road4"};
	    PplList = peoplelist;
	    exits = exitlist;

	    Global.info = "You enter the best buy, you don't see anyone, business must be slow. There is no FOSS that you can see. A door leads the way back to the dead end";
	}
    }    
}

