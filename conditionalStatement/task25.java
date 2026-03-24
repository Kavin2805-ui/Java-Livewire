package conditionalStatement;
import java.util.Scanner;
public class task25 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num % 7 == 0 || num % 10 == 7) {
	            System.out.println("It is a Buzz Number.");
	        } else {
	            System.out.println("It is Not a Buzz Number.");
	        }

	        sc.close();
	    }
	}


