import java.util.Scanner;


public class FindArithmeticMean {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;
		for(int i = 0; i < count; i++){
			System.out.printf("Enter number %d: ", i + 1);
			number = input.nextInt();
			sum += number;
		}
		float arithmetic = (float) sum / count;
		System.out.printf("Arithmetic Mean is %f", arithmetic);

	}

}
