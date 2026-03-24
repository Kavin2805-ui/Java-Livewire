package task;

public class task6 {
 public static void main(String[] args) {
	 int a=30;
	 int b=10;
	 int temp = a;
     a = b;
     b = temp;
	  System.out.println(a);
	  System.out.println(b);
 // without using third variable
	  a = a + b;
      b= a - b;
      a= a - b;
      System.out.println(a);
	  System.out.print(b);
 }
}
