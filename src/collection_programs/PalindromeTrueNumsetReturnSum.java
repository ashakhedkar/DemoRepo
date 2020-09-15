package collection_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeTrueNumsetReturnSum 
{
	/*	5. Retrieve the palindorme-true number set from given number limit and 
	 * return the sum
	   input1:90 input2:120
	   logic:99+101+111
	   output:311*/

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 ArrayList<Integer> l1=new ArrayList<Integer>();
		  for(int i=num1;i<=num2;i++)
		  {
		   int r=0,num3=i;
		   while(num3!=0)
		   {
		    r=(r*10)+(num3%10);
		    num3=num3/10;
		    }
		   if(r==i)
		    l1.add(i);  
		   }
		  System.out.println(l1);
		  int s=0;
		  for(int i=0;i<l1.size();i++)
		   s=s+l1.get(i);
		  System.out.println(s);				  
	}
}
