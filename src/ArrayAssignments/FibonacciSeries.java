package ArrayAssignments;

class FibonacciSeries  //Logic update
{
public static void main(String[] args) {
	/*5. Sum of fibonacci series up to given input.
	sum of first 3 
	logic:1+1+2
	output:4
  */
	 int sum, n,r,s,i,m;
		sum=0;
		 n=10;
		 r=1; 
		 s=1;
		 m=2;
		 i=1;
			for(i=1;i<=n;i++)
			{
				
			System.out.println(r);
			sum=r+s+m;
			m=r;
			r=s;
			s=sum;
					
			}
	
    
	

	     
	   
	}
}