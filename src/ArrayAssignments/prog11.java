package ArrayAssignments;
/*Input a int array. Square the elements in even position
and cube the elements in odd position and add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2//logic
*/

public class prog11 {
	public static int sqaureAndcubeElements(int[] a){
		 int num1=0,
			num2=0;
		 for(int i=0;i<a.length;i++)
		  if(i%2==0)
		   num1+=(a[i]*a[i]*a[i]);
		  else
		   num2+=(a[i]*a[i]);
		 return (num1+num2);
		}
	public static void main(String[] args) {
		   int a[]={1,2,3,4};
		  System.out.println(sqaureAndcubeElements(a));
	}

}
