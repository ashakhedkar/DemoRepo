package ArrayAssignments;

import java.util.StringTokenizer;

/*15)Input1=845.69, output=3:2;
Input1=20.789; output=2:3;
Input1=20.0; output=2:1;  
output is in Hashmap format.
Hint: count the no of digits.
*/
public class Prog28 {

	public static void main(String[] args) {
		 double d=845.69;
		
		 int n1=0,n2=0;
		 String s=String.valueOf(d);
		 StringTokenizer t=new StringTokenizer(s,".");
		 String s1=t.nextToken();
		 String s2=t.nextToken();
		 n1=s1.length();
		 n2=s2.length();
		 if(s1.charAt(0)=='0')
		  n1=s1.length()-1;
		 if(n2!=1)
		  if(s2.charAt(s2.length()-1)=='0')
		   n2=s2.length()-1;
		 String s3=String.valueOf(n1)+":"+String.valueOf(n2);
		 System.out.println(s3);
		
	}
	

}
