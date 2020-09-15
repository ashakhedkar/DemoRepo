package ArrayAssignments;

import java.util.Scanner;

/*Sum of fibonacci series up to given input.
  input:3
  logic:1+1+2
  output:4
*/
public class FibonacciSeries2 {// update logic
	
	public static int Fibonacci(int n){
		  int a=0,b=1,c=0,d=0;
		  
		  for(int i=0;i<=n;i++){
		   c=a+b;
		   a=b;
		   b=c;
		   d=d+c;
		  }
		  return d;
		 }
	public static void main(String[] args) {
		
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter limit");

		  int n=scan.nextInt();
		  System.out.println("sum of fibonacci up to this number is: "+Fibonacci(n));
				
	}

}
