import java.util.Scanner;


public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter: ");
		if (input.hasNextInt()){
			int number = input.nextInt();
			checkThirdDigit(number);
		}
		else {
			System.out.println("The user input is not a number");
		}

	}
	
	public static void checkThirdDigit(int number){
		int thirdDigit = (number / 100) % 10;
		if (thirdDigit == 6){
			System.out.println("The third digit is Six");
		}
		else
		{
			System.out.println("The third digit is not Six");
		}
	}

}
