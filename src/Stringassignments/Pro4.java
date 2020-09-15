package Stringassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Two inputs of a string array and a string is received.
  The array should be sorted in descending order. 
  The index of second input in a array should be retrieved.
  input1:{"ga","yb","awe"}
  input2:awe
  
  output:2
*/
       
public class Pro4 {

	 public static int retrieve(String[] str1, String str2){
		  ArrayList<String> list=new ArrayList<String>();

		  for(int i=0;i<str1.length;i++)
		  {
		   list.add(str1[i]); //adding the strings in to array list
		  }
		  Collections.sort(list) ; //sorted in ascending order
		  System.out.println(list);
		  int n=list.indexOf(str2);
		  return n;
		 }

	public static void main(String[] args) {

		  String[] str1={"ga","yb","awe"};//it will have to sort in decending order
		  String str2="yb";
		  System.out.println(retrieve(str1,str2));
				
		/*
		  Scanner scan = new Scanner(System.in);
		  int i;
			System.out.println("Enter Strings :");
			String[] str=new String[3]; 
			  String str2=scan.nextLine();

			for (i=0;i<3;i++) // used for loop for user input
			{
			str[i]=scan.nextLine(); // Assigned users value to array

			}
			  System.out.println(retrieve(str[i],str2));

			  
*/	}

}
