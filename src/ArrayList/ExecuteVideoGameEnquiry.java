package ArrayList;
import java.util.Scanner;

public class ExecuteVideoGameEnquiry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		VideoGameEnquiry videoGameEnquiry = new VideoGameEnquiry();
		String userResponse = "yes";
		
		while(userResponse.equalsIgnoreCase("yes")) {
			videoGameEnquiry.addVideoGameToList();
			
			System.out.println("Do you still want to continue with this program?");
			userResponse = sc.nextLine();
			
		}
		if(userResponse==(" ")) {
			System.out.println("Please enter a videogame name");
		}
		
		
		
		videoGameEnquiry.printVideoGameList();
		
		
		
		
		
		
		
		}

}

