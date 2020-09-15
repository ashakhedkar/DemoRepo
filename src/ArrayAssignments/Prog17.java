package ArrayAssignments;
/*. Retrieve the elements in a array, which is an input, which are greater than a 
 * specific input number. Add them and find the reverse of the sum.
*/
public class Prog17 {

	public static void main(String[] args) {

		 int[] a={23,35,11,66,14,32,65,56,55,99};
		 int b=37;
		 System.out.println(additionOfRetrievedElements(a,b));
		 }
		public static int additionOfRetrievedElements(int[] a, int b) {
		 int n=0;
		 for(int i=0;i<a.length;i++)
		  if(a[i]>b)
		   n+=a[i];
		 return n;
	}

}
