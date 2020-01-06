import java.util.Scanner;
public class ExecutePizzaToppings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PizzaToppings pizzaToppings = new PizzaToppings();
		String userResponse = "yes";
		double price = 5.99;
		double newPrice = 0;
		double finalPrice = 0;
		
		System.out.println("Enter your preferred dough:");
		String dough = sc.next();
		System.out.println("Enter your preferred sauce:");
		String sauce = sc.next();
		System.out.println("Would you like extra cheese? (+1.50)");
		String cheeseResponse = sc.next();
		if(cheeseResponse.equalsIgnoreCase("yes")) {
			 newPrice = price + 1.50;
		} else if(cheeseResponse.equalsIgnoreCase("no")) {
			System.out.println("No problem! Thanks!");
		}
		
		
		while(userResponse.equalsIgnoreCase("yes")) {
			pizzaToppings.addPizzaToppings();
		    finalPrice = newPrice + 2.00;
			if(userResponse.equalsIgnoreCase("none")) {
				
			}
		}
		
		if(userResponse== (" ")) {
			System.out.println("Please enter a topping.");
		} 
		
		System.out.println(dough);
		System.out.println(sauce);
		pizzaToppings.printPizzaToppings();
		System.out.println(finalPrice);
	}

}
