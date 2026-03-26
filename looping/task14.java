package looping;

import java.util.Scanner;

public class task14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a  integer: ");
        int a = sc.nextInt();
        int count =0;
       for(int i=2;i<a;i++) {
    	   if(a%i==0) {
    	   count++;
    	   }
       }if(count==0) {
    	   System.out.println("Yes");
       }else {
    	   System.out.println("No");
       }
}
}
