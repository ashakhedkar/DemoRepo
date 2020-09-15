package ArrayAssignments;

import java.util.Arrays;

/*4)int[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.
*/
public class Prog20 {
	public static int diffMaxMin(int[] a) {
		 Arrays.sort(a);
		 int n=a[a.length-1]-a[0];
		 return n;
		}
	
	public static void main(String[] args) {
		 int a[]={12,14,2,26,35};
		 System.out.println(diffMaxMin(a));
		
		
		}
}
