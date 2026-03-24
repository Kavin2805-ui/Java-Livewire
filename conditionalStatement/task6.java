package conditionalStatement;
import java.util.Scanner;
public class task6 {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number :");
		  int a = sc.nextInt();
		  if(a %10 == 0 ) {
			  System.out.println("It is Multiple of 10.");
		  }else {
			  System.out.println("It is Not Multiple of 10.");
		  }
	  }
}
