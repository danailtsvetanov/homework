import java.util.Scanner;


public class CheckAge {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("please, enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age is " + age);
		

	}

}
