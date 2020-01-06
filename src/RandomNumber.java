import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		 	
		int number = r.nextInt(100);
		int number2 = r.nextInt(100);
		
		Double doubleNumber = r.nextDouble();
		Double doubleNumber2 = r.nextDouble();
		
		System.out.print("Here are some of the random numbers: "+number+" "
				+number2+" "+doubleNumber+" "+doubleNumber2+" ");
		 }
	
	public void printRandomInteger(Random r) {
		System.out.println(r);
	}
	
		 	

	}


