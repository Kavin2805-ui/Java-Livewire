package conditionalStatement;

import java.util.Scanner;

public class task32 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Weight of price :");
	        int price = sc.nextInt();
	        if(price <=50000) {
	        	System.out.println("Discount: 0%");
	        	System.out.println("Total price :"+price);
	        }else if(price>=50001 && price<100000) {
	        	System.out.println("Discount: 10%");
	        	int a = price*10/100;
	        	int dis = price - a;
	        	System.out.println("Total price :"+dis);
	        }else if(price>=100001 && price<150000) {
	        	System.out.println("Discount: 15%");
	        	int b = price*15/100;
	        	int amt = price-b;
	        	System.out.println("Total price :"+amt);
	        }else {
	        	System.out.println("Discount: 20%");
	        	int c = price*20/100;
	        	int d = price - c;
	        	System.out.println("Total price :"+d);
	        }
}
}