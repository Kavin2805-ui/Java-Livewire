package looping;

import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Input :");
    	int a = sc.nextInt();
    	for(int i =1;i<=a;i++) {
    		if(i%2==0 || i%5 ==0 || i%7==0) {
    			System.out.print(i+" ");
    		}
    	}
}
}
