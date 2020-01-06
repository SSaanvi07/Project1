package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class CrunchyMouthful {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> menuList = new ArrayList<>();
	ArrayList<Double> bill = new ArrayList<>();
	ArrayList<String> customerOrder = new ArrayList<>();
	double totalPrice = 0.00;



	
	public CrunchyMouthful() {
		populateMenu();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		CrunchyMouthful crunchyMouthful = new CrunchyMouthful();
		System.out.println("Is the customer ready to order?");
		String readyToOrder = sc.next();
			if(readyToOrder.equalsIgnoreCase("yes")) {
				crunchyMouthful.printMenu();
				System.out.println("What would you like to have? Choose one item to begin with.");
				int option = sc.nextInt();
				crunchyMouthful.addItemToCustomerOrder(option);
				System.out.println("You chose: "+option+" Good choice! Now choose one more thing: ");
				int option2 = sc.nextInt();
				crunchyMouthful.addItemToCustomerOrder(option2);
				System.out.println("Ok, you ordered "+option+" and "+option2);
				System.out.println("Would you like to checkout? ");
				String checkoutResponse = sc.next();
					if(checkoutResponse.equalsIgnoreCase("yes")) {
						crunchyMouthful.checkout(option, option2);
					}

				
				
			}else {
				System.out.println("Customer is not ready to order.");
			}
		
		
	}
	
		
	
// create a method called add item to customer order	
	
	  	public void addItemToCustomerOrder( int option) {
	  		System.out.println("Item: " +option);
	  	}
	  	
	  	
	  	public void checkout(int option, int option2) {
	  		totalPrice = bill.get(option-1) + bill.get(option2-1);
	  		System.out.println("This is what you ordered: "+ menuList.get(option-1)+" ($ "+bill.get(option-1)+ ") "
	  		+ " "+ menuList.get(option2-1)+" ($"+bill.get(option2-1)+") ");
	  		System.out.println("This is your bill before tax: "+totalPrice);
	  		System.out.println("This is your bill with tax: "+(totalPrice + (totalPrice * 0.066)));
	  		System.out.println("Would you like to add a tip?");
	  		String userResponse = sc.next();
	  			if(userResponse.equalsIgnoreCase("yes")) {
	  				System.out.println("Thank you very much! How much would you like to add?");
	  				float tip = sc.nextFloat();
	  				totalPrice = totalPrice + tip + (totalPrice*0.066);
	  				System.out.println("Your final bill with the tip is: "+totalPrice+ " Thank you for dining with us!");
	  			}else
	  				System.out.println("No problem! Thank you for dining with us! Have a good rest of your day!");
	  		
	  	}

	  	
	  	
		private void populateMenu() {
			menuList.add("1. Chipotle Seitan Breakfast Burrito");
			menuList.add("2. Creole Grilled Tofu");
			menuList.add("3. Beastmode Burger Deluxe");
			menuList.add("4. Water");
			menuList.add("5. Root Beer");
			menuList.add("6. Display Menu");
			menuList.add("7. Checkout");
			bill.add(11.00);
			bill.add(12.00);
			bill.add(12.50);
			bill.add(2.00);
			bill.add(3.00);
		}
		
		public void printMenu () {
			for(int i=0; i<menuList.size(); i++) {
				if(i<5) {
					System.out.println(menuList.get(i)+ " ($"+bill.get(i)+ ")");
				}
				else System.out.println(menuList.get(i));
				
			}
			
		}
}
