package collection_programs;

import java.util.ArrayList;

public class RemoveGivenElement 
{
	/*	9. An array of integers is given.
	 * The given element is removed new array is returned.
	   input1:{10,10,20,30,76}
	  output: {20,20,76}(10 is asked to remove)*/

	public static void main(String[] args) 
	{
		int a[]={10,40,20,30,40,50};
		int c=40;
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
			if(a[i]!=c)
				l1.add(a[i]);
		int b[]=new int[l1.size()];
		for(int i=0;i<b.length;i++)
		 b[i]=l1.get(i);
	  	for(int d:b)
	  		System.out.println(d);
	}

}
