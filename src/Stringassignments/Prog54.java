package Stringassignments;

import java.util.Scanner;

/*8)Color Code Validation:
	String should starts with the Character '#'.
	Length of String is 7. 
	It should contain 6 Characters after '#' Symbol.
	It should contain Characters Between 'A-F' and Digits '0-9'.
	if String is acceptable then Output1=1
	else  Output1=-1; 
*/
public class Prog54 {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String s1=scan.next();
		 boolean b=false,b1=false;
		 
		 String s2=s1.substring(1,s1.length());
		 if(s1.length()==7)
		  if(s1.charAt(0)=='#')
		   b1=true;
		 
		 if(b1==true)
		  for(int i=0;i<s2.length();i++){
		   char c=s2.charAt(i);
		   if(c!='#'){
		   if((Character.isAlphabetic(c)&& Character.isUpperCase(c)) || Character.isDigit(c))
		    b=true;
		   else{
		    b=false;
		    break;}}}
		 if(b==true)
			  System.out.println("valid color code");
			 else
			  System.out.println("invalid color code");
		 
			}
			
	}

