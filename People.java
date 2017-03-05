public class People{

    static String[] Software;
    static String Name;
    static String Intro;
    
    //Get persons intro
    public String getIntro(){
    	return Intro;
    }
    
    //Define people stats
    public People(String person){
		if (person.equals("strange man")){
		    Name = "Richard Stallman";
		    Intro = "You approach the strange man, you can now obviosly tell that the smell is coming from him. He is rather fat and has a large unkempt gray beard. The man notices your presence and stands up. (Press Enter)" +"\n";
		    String[] software = {"emacs"};
		    Software = software;
		}
		if (person.equals("lug member")){
		    Name = "Charles";
		    Intro = "You approach the LUG member" +"\n" +"\n"+"Charles"  +"\n"+"Hi, I am a member of our local Linux User group. Our center is right behind me. I see you just recieved a new peice of software, wanna practice your FOSS fighting skills?";
		    String[] software = {"gimp"};
		    Software = software;
		}
		if (person.equals("neckbeard")){
		    Intro = "You approach the  neckbeard" +"\n" +"\n"+"neckbeard1"  +"\n"+"Do you have a copy of libre office? I would be willing to trade";
		}
		
		if (person.equals("windows fanboy")){
		    Name = "Windows fanboy";
		    Intro = "You approach the windows fanboy" +"\n" +"\n"+"windows fanboy"  +"\n"+"Windows is the best operating system, how bout I prove it to you by absolutely wrecking your software?";
		    String[] software = {"windows 7"};
		    Software = software;
		}
		if (person.equals("linus torvalds")){
		    Name = "Linus Torvalds";
		    Intro = "You approach Linus, he stands up to greet you." +"\n";
		    String[] software = {"linux kernel"};
		    Software = software;
		}
    }
    
    //Person interaction
    public void talk(String person){

    	//Richard Stallman convo
		if (person.equals("strange man")){
		    System.out.println("Richard Stallman"  +"\n"+"Welcome to the Church of Emacs! I am Saint IGNUcius, but you may call me Richard Stallman I invented free open source software (FOSS) by creating GNU. Explore the town and try and collect as much FOSS software as you can. Here is a copy of GNU/Linux, the only operating system that protects the Users freedom."+"\n"+"\n"+"You have recieved: Software - GNU/Linux Distribution. It has been added to your software repository."+"\n"+"\n"+"Richard Stallman"  +"\n"+"Now that you have your first software, its time to try it out, lets see what you've got!");
		    Repository.addProgram("gnu/linux");
		    //	    Repository.addhealth("gnu/linux", 25);
		    while(Global.gamestate == 0){
				Global.gamestate = 2;
				Combat.start();
				if(Global.gamestate == 0){
				    System.out.println("Richard Stallman"  +"\n"+"Seems like you still need some practice, lets try again");
				}
				if(Global.gamestate == 1){
				    System.out.println("Richard Stallman"  +"\n"+"Well done, you are now ready to face the evil purveyours of proprietary software.");
				}
		    }
		    Global.conversationEnd = false;
	    }
		
		if (person.equals("lug member")){
		    if ((Global.choice).equals("no")){
				System.out.println("Charles"+"\n"+"maybe some other time");
				Global.conversationEnd = false;
		    }
		    if ((Global.choice).equals("yes")){			
			    System.out.println("Charles"+"\n"+"Lets fight!");
				Global.gamestate = 2;
				Combat.start();
				if(Global.gamestate == 0){
				    System.out.println("Charles"  +"\n"+"Still a rookie huh? go visit the Linux Users group to get better software and learn some tips and tricks");
				    Global.conversationEnd = false;
				}
				if(Global.gamestate == 1){
				    System.out.println("Charles"  +"\n"+"I can't believe you beat me! I'll share a copy of my favorite FOSS software with you"+"\n"+"\n"+"You have recieved: Software - gimp. It has been added to your software repository.");
				    Repository.addProgram("gimp");
				    Repository.addhealth("gimp", 45);
		
				    Global.conversationEnd = false;
				}
		    }
		}
		
		if (person.equals("neckbeard")){
		    if ((Global.choice).equals("no")){
				System.out.println("neckbeard"  +"\n"+"too bad, come back when you do");
				Global.conversationEnd = false;
		    }
		    if ((Global.choice).equals("yes")){
				if (Repository.checkProgram("libre office") == true){
				    System.out.println("neckbeard"+"\n"+"thanks for the trade"+"\n"+"\n"+"You have recieved: Software - firefox. It has been added to your software repository.");
				    Repository.removeProgram("libre office");
				    Repository.removehealth("libre office");
				    Repository.addProgram("firefox");
				    Repository.addhealth("firefox", 30);
				    Global.conversationEnd = false;
				}
				else{
				    System.out.println("neckbeard"+"\n"+"sorry, you dont have what I need");
				    Global.conversationEnd = false;
				}
		    }
		}
		
		if (person.equals("windows fanboy")){
		    if ((Global.choice).equals("no")){
				System.out.println("windows fanboy"  +"\n"+"wuss");
				Global.conversationEnd = false;
		    }
		    if ((Global.choice).equals("yes")){		
				System.out.println("windows fanboy"+"\n"+"you're going down!");
				Global.gamestate = 2;
				Combat.start();
				if(Global.gamestate == 0){
				    System.out.println("windows fanboy"  +"\n"+"Told you microsoft products are better");
				    Global.conversationEnd = false;
				}
				if(Global.gamestate == 1){
				    System.out.println("windows fanboy"  +"\n"+"How can this be possible? You cheated!");
				    
				    Global.conversationEnd = false;
				}
		    }
		}
		
		if (person.equals("linus torvalds")){
		    System.out.println("Linus Torvalds"  +"\n"+"Welcome to my home fellow FOSS warrior! I am Linus Torvalds, the inventor of the Linux Kernel. I see that you have already gained some FOSS software. Collect more power software and then maybe you will be able to challenge me."  +"\n"+ "Are you ready to challenge me?");
			if ((Global.choice).equals("no")){
			    System.out.println("Linus Torvalds"  +"\n"+"good luck on your quest to find FOSS software!");
			    Global.conversationEnd = false;
			}
		    if ((Global.choice).equals("yes")){			
				System.out.println("Linus Torvalds"+"\n"+"even if you are prepared, this will be a very tough battle!");			
				Global.gamestate = 2;
				Combat.start();
				if(Global.gamestate == 0){
				    System.out.println("Linus Torvalds"  +"\n"+"Come back when you have better software");
				}
				Global.conversationEnd = false;
				if(Global.gamestate == 1){
				    System.out.println("Linus Torvalds"  +"\n"+"I am truly amazed, you have earned my respect.");
				}
		    }
		    Global.conversationEnd = false;	    
		}
    }
}

	    
	    
