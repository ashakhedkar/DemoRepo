package collection_programs;

import java.util.ArrayList;
import java.util.Scanner;
/*8.An arraylist of Strings is given as input. 
 * The count of the String elements that are not of size input2 string is to be 
 * returned.
   input1: {"aaa","bb","cccc","d"}
   input2: "bb"
   output: 3("bb"-length:2)
*/
public class CountStringElements 
{	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter the no.of elements:");
		 String n=scan.next();
		 ArrayList<String> l1=new ArrayList<String>();
		 for(int i=0;i<n.length();i++)
			 l1.add(scan.next());
		 System.out.println("enter the input string:");
		 String str1=scan.next();
		 int num1=str1.length();
		 int count=0;
		 for(int i=0;i<l1.size();i++)
		 {
			 int n2=l1.get(i).length();
			 if(num1!=n2)
				 count++;
		  }
		 System.out.println(count);
		
	}

}
