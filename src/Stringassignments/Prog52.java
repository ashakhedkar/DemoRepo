package Stringassignments;

import java.util.StringTokenizer;

/*6)String format : CTS-LLL-XXXX
ip1: CTS-hyd-1234
ip2: hyderabad
-> LLL must be first 3 letters of ip2.
-> XXXX must be a 4-digit number
*/
public class Prog52 {
	public static void main(String[] args) {
		
		 String input1="CTS-hyd-1234";
		 String input2="hyderabad";
		 String string=input2.substring(0, 3);
		 
		 boolean b=false;
		 StringTokenizer t=new StringTokenizer(input1,"-");
		 String s4=t.nextToken();
		 String s5=t.nextToken();
		 String s6=t.nextToken();
		 if(s4.equals("CTS") && s5.equals(string) && s6.length()==4)
		  for(int i=0;i<s6.length();i++){
		   if(Character.isDigit(s6.charAt(i)))
		    b=true;
		   else{
		    b=false;
		    }
		   }
		 if(b==true)
			  System.out.println(string);
			
	}
	 
		
}
