package ArrayAssignments;

public class Pro2 {
	
	/*  
	 *  A integer array is given as input.
	 *  find the difference between each element.
	 *  Return the index of the largest element
	 *  which has the largest difference gap.
	 *  
     */

	 public static int difference(int[] num){
		  int num1,num2=0,index=0;
		  for(int i=0;i<num.length-1;i++)
		  {
		   num1=Math.abs(num[i]-num[i+1]);//provides the absolute value
		   if(num1>num2)
		   {
		    num2=num1;
		    index=i+1; 
		    }
		   }
		  return index;
	 }
	public static void main(String[] args) {
		
		 int[] num={4,2,3,5,8};
		  System.out.println("Index:"+difference(num));
							
	}

}
