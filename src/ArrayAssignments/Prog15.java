package ArrayAssignments;
/*Retrieve the odd-position digits from input integer array.
 *  Multiply them with their index and return their sum.
*/
public class Prog15 {

	 public static int retrieve(int[] a) {
	  int sum=0;
	  for(int i=0;i<a.length;i++)
	   if(i%2!=0)
		   sum=sum+a[i]*i;
	  return sum;
	 }
			 public static void main(String[] args) {
			  int[] a={5,1,6,2};
			  System.out.println("Sum Of Odd Position Elements Multiplied With Their Index Is: ");
			  System.out.println(retrieve(a));
			 }
			}
