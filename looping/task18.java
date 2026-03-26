package looping;
import java.util.Scanner;
public class task18 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	        int a = 0, b = 1;

	        System.out.print("Fibonacci series (0 to 50): ");

	        while (a <= 50) {
	            System.out.print(a + " ");

	            int next = a + b;
	            a = b;
	            b = next;
	        }
	    }
	}