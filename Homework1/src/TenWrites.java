import java.util.Scanner;


public class TenWrites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number between 1 to 9: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		switch (value) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
		System.out.println("Five");
		break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Please, enter number between 1 to 9");
			break;
		}

	}

}
