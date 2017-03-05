import java.util.*;

public class Repository{

    private static ArrayList<String> ProgramList = new ArrayList<String>();
    private static ArrayList<Integer> Health = new ArrayList<Integer>();

    public static boolean checkProgram(String software){
	boolean b = false;
	for (int i = 0; i<Repository.getsize(); i++){
	    if(software.equals(ProgramList.get(i))){
		b= true;
	    }
	}
	return b;
    }
    public static void addProgram(String software){
	ProgramList.add(software);
    }

    public static void removeProgram(String software){
	for(int i = 0; i<ProgramList.size(); i++){
	    if (software.equals(ProgramList.get(i))){
		ProgramList.remove(i);
	    }
	}
    }

    public static int getsize(){
	return ProgramList.size();
    }
    
    public static String info(int i){
	return ProgramList.get(i);
    }
    public static void addhealth(String software, int h){
	for(int i = 0; i<ProgramList.size(); i++){
	    if (software.equals(ProgramList.get(i))){
		Health.add(i, h);
	    }
	}
    }
    public static void removehealth(String software){
	for(int i = 0; i<ProgramList.size(); i++){
	    if (software.equals(ProgramList.get(i))){
		Health.remove(i);
	    }
	}
    }
    public static void gethealth(String software){
	for(int i = 0; i<ProgramList.size(); i++){
	    if (software.equals(ProgramList.get(i))){
		Global.health = Health.get(i);
	    }
	}
    }
}
