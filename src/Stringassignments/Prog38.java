package Stringassignments;
/*
10)input --String input1 ="xaXafxsd"
output--String output1="aXafsdxx"
operation-- remove the character "x"(only lower case) 
from string and place at the end
*/
public class Prog38 {

	public static void main(String[] args) {

			 String input="xaXafxsd";
			 
			 StringBuilder sb=new StringBuilder(input);
			 int j=0;
			 for(int i=0;i<sb.length();i++)
			  if(sb.charAt(i)=='x'){
			   sb.deleteCharAt(i);
			   j++;
			   }
			// for(int i=0;i<j;i++)
			 System.out.println(sb.toString());
					
		
	}

}
