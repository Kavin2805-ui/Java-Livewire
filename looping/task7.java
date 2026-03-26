package looping;

import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Input :");
    	int a = sc.nextInt();
    	for(int i =1;i<=a;i++) {
    		if(i%2==0 || i%3 ==0) {
    			System.out.print(i+" ");
    		}
    	}
}
}