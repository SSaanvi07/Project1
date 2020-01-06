import java.util.Scanner;

public class SquareRoot {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String answer;
		
	do {
		
		System.out.println("Enter a number:");
		double number = sc.nextInt();
		System.out.println(Math.sqrt(number));
		System.out.println("Do you want to continue? Enter yes or no");
		answer = sc.next();
     	}
		while(answer.equalsIgnoreCase("Yes"));
	
	}

}
 