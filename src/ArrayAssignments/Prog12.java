package ArrayAssignments;

import java.util.Scanner;

/*Get a input string. Find if it is a negative number, 
if true return the absolute value, in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1
*/
public class Prog12 {
	 public static int negativeString(String str){
		  int num1=0;
		  if(str.startsWith("-")){
		  int num=Integer.parseInt(str);
		  if(num<0)
		   num1=Math.abs(num);}
		  else
		   num1=-1;
		  return num1;
		 }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  String str=scan.next();
		  System.out.println(negativeString(str));
	}

}
