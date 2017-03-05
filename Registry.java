import java.util.*;

public class Registry{

private	 static ArrayList<String> ProgramList = new ArrayList<String>();

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
}
