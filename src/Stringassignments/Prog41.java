package Stringassignments;

import java.util.Scanner;

/*
15) pan card number validation:
    all letters should be in caps,should be of 8 chars.
    first three letters must be alphabets.
    next 4 letters should be digits and last letter should be an alphabet
    */
public class Prog41 {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		 String pan=scan.next();
	
		 boolean b=false,b1=false,b2=false;
		 
		 String s1=pan.substring(0, 3);
		 String s2=pan.substring(3, 7);
		 
		 if(pan.length()==8){
		  if(Character.isAlphabetic(pan.charAt(pan.length()-1)) && Character.isUpperCase(pan.charAt(pan.length()-1)))
		   b1=true;
		 }
		 if(b1==true)
		 {
		  for(int i=0;i<s1.length();i++)
		   if(Character.isAlphabetic(s1.charAt(i)) && Character.isUpperCase(s1.charAt(i)))
		    b2=true;
		   else
		    {
			   b2=false;
			   break;
			   }
		 }
		 if(b2==true)
		  for(int i=0;i<s2.length();i++)
		   if(Character.isDigit(s2.charAt(i)))
		    b=true;
		   else
		   {
			   b=false;
		       break;
		   }
	
		 if(b==true)
			  System.out.println("valid Pancard Number");
			 else
			  System.out.println("not a valid Pancard Number");
	}
}
