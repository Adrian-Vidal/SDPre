import java.util.Scanner;
	public class Objective5Lab4 {
		public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);


		System.out.println("Please enter a number:");
		int userNum = userInput.nextInt();
		

		if(userNum % 2 == 0){
		System.out.println(userNum + " is an even number.");
		}

		else if(userNum % 2 == 1){
		System.out.println(userNum + " is an odd number.");
		}

		userInput.close();



		}




}
