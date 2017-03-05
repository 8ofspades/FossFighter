//Defines user repository Class where personal software is stored
import java.util.*;

public class Repository{

    private static ArrayList<String> ProgramList = new ArrayList<String>();
    private static ArrayList<Integer> Health = new ArrayList<Integer>();

    //Check if given software exists in repository
    public static boolean checkProgram(String software){
		boolean b = false;
		for (int i = 0; i<Repository.getsize(); i++){
		    if(software.equals(ProgramList.get(i))){
		    	b = true; //yep it exists
		    }
		}
		return b;
    }
    
    //Adds a program to the repository
    public static void addProgram(String software){
    	ProgramList.add(software);
    }
    
    //Lists all available softwares
    public static void list(){
    	for(int i = 0; i<ProgramList.size(); i++){
    		int num = i + 1;
    		String progName = ProgramList.get(i);
    		System.out.println(num + ". " + progName);
		}
    }

    //Deletes a program from the repository
    public static void removeProgram(String software){
		for(int i = 0; i<ProgramList.size(); i++){
		    if (software.equals(ProgramList.get(i))){
		    	ProgramList.remove(i); //get rid of that program
		    }
		}
    }

    //Get amount of programs in repo
    public static int getsize(){
    	return ProgramList.size();
    }
    
    //Get program name at certain index
    public static String getProgramName(int i){
    	return ProgramList.get(i);
    }
    
    //Add health to ailing program
    public static void addhealth(String software, int h){
		for(int i = 0; i<ProgramList.size(); i++){
		    if (software.equals(ProgramList.get(i))){
		    	Health.add(i, h);
		    }
		}
    }
    
    //Remove health from program when damage is dealt
    public static void removehealth(String software){
		for(int i = 0; i<ProgramList.size(); i++){
		    if (software.equals(ProgramList.get(i))){
		    	Health.remove(i);
		    }
		}
    }
    
    //Get health of program
    public static void gethealth(String software){
		for(int i = 0; i<ProgramList.size(); i++){
		    if (software.equals(ProgramList.get(i))){
		    	Global.health = Health.get(i);
		    }
		}
    }
}
