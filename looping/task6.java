package looping;

import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Input :");
    	int a = sc.nextInt();
    	for(int i=2;i<a;i+=2) {
    		System.out.print(i+" ");
    	}
}
}