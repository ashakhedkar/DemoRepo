package Stringassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*An arraylist of Strings is given as input.
The count of the String elements that are not of size input2
string is to be returned.
input1: {"aaa","bb","cccc","d"}
input2: "bb"
output: 3("bb"-length:2)
Update logic
*/
public class Prog10 {
	
	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter the no.of elements:");
		  String n=scan.next();
		  List<String> list=new ArrayList<String>();
		  for(int i=0;i<n.length();i++)
		   list.add(scan.next());
		  System.out.println("enter the input string:");
		  String s1=scan.next();
	
		  int n1=s1.length();
		  int c=0;
		  for(int i=0;i<list.size();i++){
		   int n2=list.get(i).length();
		   if(n1!=n2)
		    c++;
		  }
		  System.out.println(c);
		 
	
	
	}

}
