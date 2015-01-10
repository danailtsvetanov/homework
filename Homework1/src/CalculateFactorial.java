import java.util.Scanner;


public class CalculateFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, enter positive number: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int fact = 1;
		for(int i = 1; i <= number; i++)
		{
			fact = fact*i;
		}
		System.out.printf("The Factorial from %d is %d", number, fact);

	}

}
