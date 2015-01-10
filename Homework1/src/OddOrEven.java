import java.util.Scanner;


public class OddOrEven {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		if (number % 2 == 0){
			
			System.out.printf("The number %d is even", number);
		}
		else {
			
			System.out.printf("The number %d is odd", number);
		}

	}

}
