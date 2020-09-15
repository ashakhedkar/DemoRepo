package ArrayAssignments;
/*
2)Given array of intergers,print the sum of elements sqaring/cubing as
 per the power of their indices.         
//answer=  sum=sum+a[i]^i;// use logic
eg:input:{2,3,5}
Output:29
*/
public class Prog19 {
	public static int suaringAndCubing(int[] a) {
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		  sum=(int) (sum+(Math.pow(a[i], i)));
		 return sum;
		 
		 /*30  60
		  * 
		  * 
		*/
}
	public static void main(String[] args) {

			 int a[]={2,3,5};
			 System.out.println(suaringAndCubing(a));
			 
	
	}
}
