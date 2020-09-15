package ArrayAssignments;

import java.util.ArrayList;
import java.util.List;

/*Retrieve the max from array which is in a odd-index
*/
public class Prog14 {

	public static int retrieveMax(int[] a) {
	 List<Integer> list=new ArrayList<Integer>();
	 for(int i=0;i<a.length;i++)
	  if(i%2!=0)
		  list.add(a[i]);
	        int b=0;
	    for(int i=0;i<list.size();i++){
	      int c=(Integer) list.get(i);
	      if(c>b)
	      b=c; 
	      }
	      return b;
	}
	
	public static void main(String[] args) {
	 int[] a={11,22,33,44,11,100,43,78,99};
	 System.out.println("This is max element at odd position of array "+retrieveMax(a));
	 }
	}
