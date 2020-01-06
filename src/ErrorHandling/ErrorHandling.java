package ErrorHandling;

import java.util.Scanner;

public class ErrorHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int myNumber = -1;
		
		
		while(myNumber==-1) {
			try {
				System.out.println("Enter a number greater than zero: ");
				myNumber = sc.nextInt();
			
			}catch(Exception e) {
				if(myNumber>-1)
				System.out.println("Please check your number "+e.getMessage() + " "+e.hashCode());
				sc.nextLine();
			}
		}
		
		System.out.println("My number is: "+myNumber);
	}

}
