import java.util.Scanner;


public class BiggestOfFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxValue = Integer.MIN_VALUE;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.printf("Enter number %d ", i + 1);
			int num = input.nextInt();
			if(num > maxValue)
			{
				maxValue = num;
			}
			
		}
		System.out.println("Max Value is: " + maxValue);

	}

}
