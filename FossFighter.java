//Main gain
import java.util.*;

public class FossFighter{
	
	//setup initial start conditions
    public static void main(String[] args){
		System.out.println("FOSS FIGHTERS: The Ultimate FOSS Adventure");
		Scanner input = new Scanner(System.in);
		Processor processor = new Processor();
		String command = ""; 
		Location.setlocation("church of emacs");
		System.out.println(Global.info);
		//process commands until quit is typed
		while (!command.equals("quit")){
		    command  = input.nextLine();
		    processor.processCommand(command);
		}
		input.close();
    }
}
