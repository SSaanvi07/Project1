import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hey there! Enter a number: ");
		double number = sc.nextDouble();
		System.out.println("Cool! Enter a second number: ");
		double number2 = sc.nextDouble();
		System.out.println("Nice! Now what do you want me to do with these numbers?"
				+ "You can +, -, *, /, find the square root (enter sqrt),"
				+ "or find the square (enter 2) ");
		String operation = sc.next();
		if(operation=="+") {
			System.out.println(number + number2);
		}else if (operation=="-") {
			System.out.println(number - number2);
		}else if (operation=="*") {
			System.out.println(number * number2);
		}else if (operation=="/") {
			System.out.println(number/number2);
		}else if (operation.equalsIgnoreCase("sqrt")) {
			double sqrt = Math.sqrt(number);
			double sqrt2 = Math.sqrt(number2);
			System.out.println(sqrt);
			System.out.println(sqrt2);
		}else if (operation=="2") {
			System.out.println(number*number);
			
		}
	}

}
