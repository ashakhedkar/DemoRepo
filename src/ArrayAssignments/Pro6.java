package ArrayAssignments;

import java.util.ArrayList;
import java.util.List;

/*
 * .Given two integer arrays. merge the common elements
 *  into a new array. find the sum of the elements
     input1:{1,2,3,4}
     input2:{3,4,5,6}
     logic:{3,4}
     output:7
 */
public class Pro6 {
	 public static int merge(int a[],int b[]){
		  List<Integer> list1=new ArrayList<Integer>();
		  List<Integer> list2=new ArrayList<Integer>();
		  int d=0;
		  for(int i=0;i<a.length;i++)
		   list1.add(a[i]);
		  for(int j=0;j<b.length;j++)
		   list2.add(b[j]);
		  list1.retainAll(list2);
		  for(int k=0;k<list1.size();k++)
		   d=d+(Integer) list1.get(k);
		  return d;
		 }

	public static void main(String[] args) {

			
		 int[] a={2,3,4,5};
		  int[] b={7,4,9,5};
		  System.out.println("addition of common elements:"+merge(a,b));
		
		
		
		
	}

}
