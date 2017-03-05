import java.util.*;

public class Conversation{

    public static void start(String person){	
		Global.conversationEnd=true;
		People lad = new People(person);
		System.out.println(lad.getIntro());
		Scanner response = new Scanner(System.in);
		String answer = "";
	
		while(Global.conversationEnd==true){
		    //System.out.println(Global.output);
		    answer = response.nextLine();
		    Global.choice = answer;
		    lad.talk(person);
		}
		response.close();
    }
}
