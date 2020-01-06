package ErrorHandling;
import java.util.Scanner;

public class PracticeErrorHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	
		
		
			System.out.println("Enter first number");
		    int num1 = sc.nextInt();
			System.out.println("Enter 2nd number");
		    int num2 = sc.nextInt();
		
		  while(num2==0);
			try {
				System.out.println(num1/num2);
			}catch(Exception e) {
				System.out.println("You can't divide by zero. Try a different divisor. ");
			}
			
		

		System.out.println("Your numbers:"+ num1 + ", " + num2);
		
	}

}
