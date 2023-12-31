import java.util.Scanner;
public class App {
	public static void main(String [] args){
		
		String q1 = "_____ is used to find and fix bugs in the Java programs.\n"
				+ "(a)JVM\n(b)JRE\n(c)JDK\n(d)JDB\n";
						
	     String q2 = "What is the return type of the hashCode() method in the Object class?\n"
					+ "(a)object\n(b)int\n(c)long\n(d)void\n";
	     
	     String q3= "In which process, a local variable has the same name as one of the instance variables?\n"
	     			+ "(a)Serialization\n(b)Variable Shadowing\n(c)Abstraction\n(d)Multi-threading\n";
	     
	     String q4 = "Which of the following is true about the anonymous inner class?\n"
					+ "(a)It has only methods\n(b)Objects can't be created\n(c)It has a fixed class name\n(d)It has no class name\n";					
	     
	     String q5 = "Which of the following is a reserved keyword in Java?\n"
					+ "(a)object\n(b)strictfp\n(c)main\n(d)system\n";

	     
	     Ouestion [] questions = {
	    		 new Ouestion(q1, "d"),
	    		 new Ouestion(q2, "b"),
	    		 new Ouestion(q3, "b"),
	    		 new Ouestion(q4, "d"),
	    		 new Ouestion(q5, "b"),
	    		 
	       };
	     takeTest(questions);
	     
         }
	
	public static void takeTest(Ouestion [] questions) {
	int score = 0;
	Scanner keyboardInput = new Scanner(System.in);
	for(int i = 0; i < questions.length; i++){
		System.out.println(questions[i].prompt);
		System.out.println("Enter your answer");
		String answer = keyboardInput.nextLine();
		if (answer.equals(questions[i].answer)) {
			score++;
			
		}
	}
	
	System.out.println("You|got "+ score + "/" + questions.length);
	
	}
	
	
	
}