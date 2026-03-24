package conditionalStatement;

import java.util.Scanner;

public class task3 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
 	 System.out.print("enter the number a:");
 	 int a = sc.nextInt();
 	 if(a>0) {
 		 System.out.print(a);
 	 }else {
 		 System.out.print(-a);
 	 }
  }
}
