import java.util.Scanner;


public class DeclareVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		firstNumber = input.nextInt();
		System.out.print("Enter second number: ");
		secondNumber = input.nextInt();
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("The first number is " + firstNumber);
		System.out.println("The second number is " + secondNumber);
		

	}

}
