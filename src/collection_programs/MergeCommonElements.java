package collection_programs;

public class MergeCommonElements 
{
	/*Q1.Given two integer arrays. merge the common elements into a new array.
	 *  find the sum of the elements
	 *  input1:{1,2,3,4}
	 *  input2:{3,4,5,6}
	 * logic:{3,4}
	 * output:7
*/
	public static void main(String[] args) 
	{
		int arr1[]={1,2,3,4};
		int arr2[]={3,4,5,6};
		int sum=0; 
		
		  for(int i=0;i<arr1.length;i++)
		  {
		   for(int j=0;j<arr2.length;j++)
		   {
		    if(arr1[i]==arr2[j])
		    {
				sum=sum+arr1[i];
				System.out.print("common element : "+arr1[i]+"\t");

		    }
		   }
		 }		
		  System.out.println("sum="+sum);
		}
}
