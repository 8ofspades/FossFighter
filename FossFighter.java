import java.util.*;

public class FossFighter{

    public static void main(String[] args){
	System.out.println("FOSS FIGHTERS: The Ultimate FOSS Adventure");
	Scanner input = new Scanner(System.in);
	Processor processor  = new Processor();
	String command = ""; 
	Location location = new Location();
	Location.setlocation("church of emacs");
	Conversation converstation  = new Conversation();
	Software mysoftware;
	Software enemysoftware;
	mysoftware = new Software();
	enemysoftware = new Software();
	System.out.println(Global.info);
	//	Repository repository = new Repository();
	while (!command.equals("quit")){
	    command  = input.nextLine();
	    processor.processCommand(command);

	}
    }
}
