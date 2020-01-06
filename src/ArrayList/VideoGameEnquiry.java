package ArrayList;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VideoGameEnquiry {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<String> videoGameList = new ArrayList<String>();
	
	public VideoGameEnquiry() {
		
	}
	
	public void addVideoGameToList() {
		System.out.println("Enter your favorite video game: ");
		String videoGameName = sc.nextLine();
		videoGameList.add(videoGameName);
		
		

	}
	
	public void printVideoGameList() {
		for(int i=0; i<videoGameList.size(); i++) {
			System.out.println(videoGameList.get(i));
		}
		
	}
	
	

}
