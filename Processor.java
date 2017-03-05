public class Processor{
    public Processor(){}
   
    public void processCommand(String command){
		//break command into words
		command = command.toLowerCase();
		int index = command.indexOf(" ");
		String[] words = {command.substring(0, index), command.substring(index+1)};
		determineAction(words);
		//modify game state based on action
    }
    
    public static void determineAction(String[] words){
		int shopstate = 0;
	
		//Inspect your surroundings case
		if (words[0].equals("inspect")){
		    if (words[1].equals("registry")){
			System.out.println("Your registry contains the following software:");
				for (int i = 0; i<Repository.getsize(); i++){
				    System.out.println(Repository.getProgramName(i));
				}
		    }
		    if(words[1].equals("rack")){
				if(shopstate == 0){
				    System.out.println("A free copy of libre office is in here");
				}
				else{
				    System.out.println("the rack is empty");
				}
		    }
		    
		    if (words[1].equals("room")||words[1].equals("location")||words[1].equals("area")){
			    System.out.println(Global.info);
		    }
		}
		
		//Interact with your surroundings case
		if (words[0].equals("take") && words[1].equals("libre office") && shopstate ==0){
		    Repository.addProgram("libre office");
		    Repository.addhealth("libre office", 60);
		    shopstate = 1;
		    System.out.println("you take the software");
		}
		
		if (words[0].equals("remove")){
		    Repository.removeProgram(words[1]);
		}
		
		//Move around the world
		if (words[0].equals("open")||words[0].equals("go")||words[0].equals("enter")){
		    for(int i = 0; i<Location.exitslength(); i+=2){
				if ((Location.exits[i]).equals(words[1])){
				    Location.setlocation(Location.exits[i+1]);
				    System.out.println(Global.info);
				    break;
				}
				else{
				    System.out.println("no such exit");
				}
		    }
		}
		
		//Talk to people case
		if (words[0].equals("approach")){
		    for(int i = 0; i<Location.listlength(); i++){
				if ((Location.PplList[i]).equals(words[1])){
				    Conversation.start(words[1]);
				}
				else{
				    System.out.println("no such person");
				}
		    }
		}	
    }
}
