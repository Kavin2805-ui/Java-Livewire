package conditionalStatement;
import java.util.Scanner;
public class task5 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number :");
	  int a = sc.nextInt();
	  if(a %5 ==0 ) {
		  System.out.println("It is Multiple of 5.");
	  }else {
		  System.out.println("It is Not Multiple of 5.");
	  }
  }
}
