package Stringassignments;

import java.util.Scanner;

public class Pro3 {
	/*Two input strings are accepted.
	 * If the two strings are of same length
	 * concat them and return, if they are not of same
	 * length, reduce the longer string to size of smaller one,
	 * and concat them
	 * */
	
	public static void main(String[] args) {

		 Scanner scan=new Scanner(System.in);
		  String str1=scan.next();
		  String str2=scan.next();
		  
         StringBuffer sb=new StringBuffer();
		  if(str1.length()==str2.length())
		      sb.append(str1).append(str2);
		  else
			  if(str1.length()>str2.length())
			  {
		         str1=str1.substring(str1.length()/2, str1.length());
		         sb.append(str1).append(str2);
		       }
		  else
			  if(str1.length()<str2.length())
			  {
		        str2=str2.substring(str2.length()/2, str2.length());
		        sb.append(str1).append(str2);
		       }
		    System.out.println(sb.toString());
		 }
	  		
	}


