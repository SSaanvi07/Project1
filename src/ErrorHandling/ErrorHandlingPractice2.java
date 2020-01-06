
package ErrorHandling;

import java.util.Scanner;

public class ErrorHandlingPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Enter your first number: ");
	    num1 = sc.nextInt();
		System.out.println("Nice! Now enter your second number: ");
		num2 = sc.nextInt();
		
	while(num2==0) {
		
		try {
			System.out.println(num1/num2);
			sc.nextInt();
		}catch(Exception e) {
			System.out.println(	"You can't divide by zero, use another number");
			sc.next();
		}
	
	}
	System.out.println(num1/num2);
	
}

}
