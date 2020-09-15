package ArrayAssignments;

/*14)perfect no or not?
 * a perfect number is a positive integer that is equal to the sum 
 * of its proper positive divisors, that is, 
 * the sum of its positive divisors excluding the number itself.
 * */


public class Prog27 {
	public static void main(String[] args) {
		 int n=0;
		 int n1=0;
		 boolean b=false;
		 for(int i=1;i<n;i++)
		  if(n%i==0)
		   n1=n1+i;
		 if(n1==n)
		  b=true;
		 System.out.println(b);
	
	
  }
}
