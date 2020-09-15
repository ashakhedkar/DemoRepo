package Stringassignments;

import java.util.Scanner;

/*
14)Validate Password
validation based on following criteria:
-> minimum length is 8
-> should contain any of these @/_/#
-> should not start with number/special chars(@/#/_)
-> should not end with special chars
-> can contain numbers,letters,special chars
*/
public class Prog40 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 String password=scan.next();
		 boolean b=false,b1=false,b2=false;
		 
		 if(password.length()>=8)
		  if(!Character.isDigit(password.charAt(0)))
		   if(password.charAt(0)!='@' && password.charAt(0)!='_' && password.charAt(0)!='#')
		    if(password.charAt(password.length()-1)!='@' && password.charAt(password.length()-1)!='_' && password.charAt(password.length()-1)!='#')
		     b1=true;
		 if(b1==true)
		  for(int i=0;i<password.length();i++)
		   if(Character.isAlphabetic(password.charAt(i)) || Character.isDigit(password.charAt(i)) || password.charAt(i)=='#' || password.charAt(i)=='@' || password.charAt(i)=='_')
		    b2=true;
		 if(b2==true)
		  if(password.contains("#") || password.contains("@") || password.contains("_"))
		   b=true;
		
		 if(b==true)
			  System.out.println("valid password");
			 else
			  System.out.println("not a valid password");
		 
		 
			}
	
	}
