import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String response;
	do {
		
		System.out.println("Enter a number, and get its products.");
		int number = sc.nextInt();
		
		
		for(int i = 1; i<=10; i++) {
			System.out.println(number+" x "+i+" = "+number*i);
		}
		System.out.println("Do you want to continue with this program? Enter Yes or No");
	    response = sc.next();
		}
		while(response.equalsIgnoreCase("Yes"));
			

	
	
	}

}
