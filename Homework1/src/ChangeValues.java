import java.util.Scanner;


public class ChangeValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNumber = input.nextDouble();
		System.out.println("Enter second number: ");
		double secondNumber = input.nextDouble();
		if(firstNumber > secondNumber)
		{
			firstNumber = firstNumber + secondNumber;
			secondNumber = firstNumber - secondNumber;
			firstNumber = firstNumber - secondNumber;
		}
		System.out.println("First number is " + firstNumber);
		System.out.println("Second number is " + secondNumber);

	}

}
