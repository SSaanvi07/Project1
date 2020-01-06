import java.util.ArrayList;
import java.util.Scanner;

public class PizzaToppings {
	
	public Scanner sc = new Scanner(System.in);
	
	public ArrayList<String> pizzaToppingList = new ArrayList<>();
	
	public PizzaToppings() {
		
	}
	
	public void addPizzaToppings() {
		System.out.println("Hey there! Enter your favorite pizza toppings (don't wworry you'll be allowed to add more later.");
		String pizzaTopping = sc.next();
		pizzaToppingList.add(pizzaTopping);	
	
		
	}
	
	public void printPizzaToppings() {
		for(int i=0; i<=pizzaToppingList.size(); i++) {
			System.out.println(i);
		}
	}

}
	