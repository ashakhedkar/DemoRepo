package ArrayAssignments;

/*15) Given an array int a[]. Add the sum at even indexes.
 * do the same with odd indexes.
   if both the sum is equal return 1 or return -1.
*/
public class Prog23 {

	public static int add(int[] a) {
	 int n1=0,n2=0,n3=0;
	 for(int i=0;i<a.length;i++)
	  if(i%2==0)
	   n1+=a[i];
	  else
	   n2+=a[i];
	 if(n1==n2)
	  n3=1;
	 else
	  n3=-1;
	 return n3;
	
	}	
	public static void main(String[] args) {

		 int a[]={1,2,3,4,5,6}; 
		 System.out.println(add(a));
		
		
	}

}
