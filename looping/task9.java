package looping;

import java.util.Scanner;

public class task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Input :");
    	int a = sc.nextInt();
         int count =0;
         int i=1;
         while(count<a) {
        	 if(i%3==0 || i%5==0 || i%7==0) {
        		 System.out.print(i+" ");
        		 count++;
        	 }
        	 i++;
         }
}
}