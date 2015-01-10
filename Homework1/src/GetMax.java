import java.util.Scanner;


public class GetMax {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter firstNumber: ");
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
		System.out.println("Enter secondNumber: ");
		int secondNumber = input.nextInt();
		System.out.printf("The biggest number is: %d", getMax(firstNumber, secondNumber));

	}
	public static int getMax(int a, int b){
		
		if(a > b){
			return a;
		}else{
			return b;
		}
	}
	

}
