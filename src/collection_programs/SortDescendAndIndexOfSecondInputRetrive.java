package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SortDescendAndIndexOfSecondInputRetrive 
{
	/*	4.Two inputs of a string array and a string is received. 
	 * The array should be sorted in descending order. 
	 * The index of second input in a array should be retrieved.
	input1:{"ga","yb","awe"}
	input2:awe
	output:2
*/
	public static void main(String[] args) 
	{
		  String[] s1={"good","yMe","awe"};
		  String s2="awe";
		  
		  ArrayList<String> al=new ArrayList<String>();
		  for(int i=0;i<s1.length;i++)
		  al.add(s1[i]);
		  Collections.sort(al,Collections.reverseOrder()) ;
		  System.out.println(al);
		  int n=al.indexOf(s2);
		  System.out.println(n);
	}
}
