package looping;

import java.util.Scanner;

public class task11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        int count =0;
        while(num > 0) {
        	 num = num/10;
        	count+=1;
        }
      
		System.out.print(count);
}
}