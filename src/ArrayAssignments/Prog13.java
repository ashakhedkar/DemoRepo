package ArrayAssignments;

import java.util.Arrays;

/*find the average of the maximum and minimum number
 *  in an integer array
*/
public class Prog13 {

	 public static int avgOfMinMaxNum(int[] a) 
	 {
	   Arrays.sort(a);
	   int b=a[0];
	   int c=a[a.length-1];
	   int r=(b+c)/2;
	   return r;
      }

	public static void main(String[] args) {
		 int[] a={10,54,23,14,32,45};
		  System.out.println(avgOfMinMaxNum(a));
		 }

}
