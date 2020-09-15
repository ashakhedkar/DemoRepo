package Stringassignments;

import java.util.Scanner;
/*Get a input string. reverse it and parse it with '-'.
  input:computer
  output:r-e-t-u-p-m-o-c
*/
public class Pro1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter the String:");
	     String str=scan.next();

	     StringBuffer sb1=new StringBuffer(str);
	     sb1.reverse();
	     StringBuffer sb2=new StringBuffer(str);
         //increase the length of character
	    for(int i=0;i<(2*str.length()-1);i++){
	    	if(i%2!=0)
	    	{
	    		sb2=sb1.insert(i, '-');
	    	}
	    }	    
	    System.out.println(sb1);

	}

}
