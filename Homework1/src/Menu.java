import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		int choice = 0;
		boolean keepGoing = true;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(keepGoing){
			
			System.out.println("\nHello, this program has 4 options:");
			System.out.println("1. Reverse");
			System.out.println("2. Factorial");
			System.out.println("3. Arithmetic");
			System.out.println("4. Exit");
			choice = input.nextInt();
			if(choice < 1 || choice > 4){
		System.out.println("Please, enter a value between 1 to 4");	
		}else {
		switch (choice) {
		case 1:
			reverseDigit();
			break;
		case 2:
			calculateFactorial();
			break;
		case 3:
			findArithmetic();
			break;
		case 4:
			keepGoing = false;
			System.out.println("Bye");
			break;

		default:
			System.out.println("Please, enter value between 1 to 4");
			break;
		}
		}
			
			}
		}
		
           public static void reverseDigit(){
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
           public static void findArithmetic()
           {
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
           public static void calculateFactorial(){
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


	


