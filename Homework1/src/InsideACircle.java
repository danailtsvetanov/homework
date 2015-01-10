import java.util.Scanner;


public class InsideACircle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter cordinate X: ");
		int x = input.nextInt();
		System.out.println("Please, enter cordinate Y: ");
		int y = input.nextInt();
		if ((x*x + y*y) <= 8*8){
			System.out.println("The point is inside in the circle");
		}
		else {
			System.out.println("The point is not inside in the circle");
		}

	}

}
