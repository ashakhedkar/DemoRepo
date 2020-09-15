package ArrayAssignments;

public class Pro3 {
	/*
 	  A number is given as input. 
	  Find the odd digits in the number,
	  add them and find if the sum is odd or not.
	  if even return -1, if odd return 1
	*/
		 public static int oddSum(int n)
		 {
		  int rem, sum=0;
		  int num;
     	  while(n!=0)
		  {
		    rem=n%10;//
		    if((rem%2)!=0)
		    sum=sum+rem;
		    n=n/10;
	       }

		   if(sum%2==0)
		   {
		   num=-1;
		   }
		  else
		   num=1;
		  
		  return num; 
	 }

	public static void main(String[] args) {
		
		 int n=44;
		  System.out.println(oddSum(n));
		
		
		
	}

}
