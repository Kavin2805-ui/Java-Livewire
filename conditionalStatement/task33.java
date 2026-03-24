package conditionalStatement;

import java.util.Scanner;

public class task33 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Weight of parcel:");
	        int par = sc.nextInt();
	        if(par<=100) {
	        	System.out.println("ordinary booking Rs.80");
	        	System.out.println("express booking Rs.100 ");
	        	
	        }else if(par>=101 && par <=500) {
	        	System.out.println("ordinary booking Rs.150");
	        	System.out.println("express booking Rs.200 ");
	        }else if(par>=501 && par <1000) {
	        	System.out.println("ordinary booking Rs.210");
	        	System.out.println("express booking Rs.250");
	        }else{
	        	System.out.println("ordinary booking Rs.250");
	        	System.out.println("express booking Rs.300");
	        }
}
}