package conditionalStatement;

import java.util.Scanner;

public class task26 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter a number :3 ");
        int c = sc.nextInt();
        if(a>b && a>c) {
        	 System.out.println("A is greater");
        }else if(b>c && b>a) {
        	System.out.println("B is greater");
        }else {
        	System.out.println("C is greater");
        }

}
}