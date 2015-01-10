import java.util.Scanner;


public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter digit ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int digit = input.nextInt();
		int reverse = 0;
		int tmp = 0;
		do {
			tmp = digit % 10;
			reverse = reverse*10 + tmp;
			digit = digit / 10;
			
		}while (digit > 0);
		
		System.out.println(reverse);
		}
	}


