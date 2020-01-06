import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendsArrayListMethod {
	
	public FriendsArrayListMethod() {
		
	}

	public void printFriendNames(ArrayList<String> friendsList) {
		for(int i=0; i<friendsList.size(); i++) {
			System.out.println(friendsList.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> friendsList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String answer = "yes";
		
		while(answer.equalsIgnoreCase("yes")) {
			System.out.println("Enter your friend's name");
			String friendsName = sc.nextLine();
			friendsList.add(friendsName);
			System.out.println("Do you want to add any more names? Enter yes/no");
			answer=sc.nextLine();
				
		}
		
		FriendsArrayListMethod falm = new FriendsArrayListMethod();
		falm.printFriendNames(friendsList);
	}

}
