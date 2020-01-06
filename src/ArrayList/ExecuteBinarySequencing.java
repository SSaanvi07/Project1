package ArrayList;
import java.util.*;

public class ExecuteBinarySequencing {
	
	int number = 0;
	static Scanner sc = new Scanner(System.in);
	
	static BinarySequencing binarySequencing = new BinarySequencing();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hey, guess a number between 1-100. The other guy's gonna guess it; i won't tell him. Once you got it, tell me");
	    int number = sc.nextInt();
	    binarySequencing.initiateProgram();
	    binarySequencing.guessTheNumber();
	}
	
	public static void guessNumber() {
		System.out.println("I'm the other guy"
				+". Give me two boundaries for your number like 1-100.");
		int startNumber = sc.nextInt();
		int endNumber = sc.nextInt();
		
		
		
	}

}
