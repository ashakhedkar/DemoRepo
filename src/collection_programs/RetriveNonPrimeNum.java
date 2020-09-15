package collection_programs;

import java.util.ArrayList;

public class RetriveNonPrimeNum 
{
/*	11. Retrieve the non-prime numbers within the range of a given input.
 *  Add-up the non-prime numbers and return the result.*/

	public static void main(String[] args) 
	{
		 int i=20, j=40;
		 int k=0;
		 ArrayList<Integer> l1=new ArrayList<Integer>();
		 ArrayList<Integer> l2=new ArrayList<Integer>();
		 for(int a=i;a<=j;a++){
		  int count=0;
		  for(int b=2;b<a;b++)
		   if(a%b==0)
		    count++;
		  if(count==0)
		   l1.add(a); }
		 for(int e=i;e<=j;e++)
		  l2.add(e);
		 l2.removeAll(l1);
		 for(int d=0;d<l2.size();d++)
		  k=k+l2.get(d);
		 
		System.out.println(k);
	}

}
