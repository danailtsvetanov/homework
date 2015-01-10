import java.util.Scanner;


public class ReadNumbersFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNumber = input.nextDouble();
		System.out.println("Enter second number: ");
		double secondNumber = input.nextDouble();
		System.out.println("Enter third number: ");
		double thirdNumber = input.nextDouble();
		getMaxValue(firstNumber, secondNumber, thirdNumber);
	}
	public static void getMaxValue(double firstNumber, double secondNumber, double thirdNumber)
	{
		if((firstNumber >= secondNumber) && (firstNumber >= thirdNumber))
		{
			System.out.println("Largest number is: " + firstNumber);
		} else if((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
			System.out.println("Largest number is: " + secondNumber);
		} else {
			System.out.println("Largest number is " + thirdNumber);
		}
	}

}
