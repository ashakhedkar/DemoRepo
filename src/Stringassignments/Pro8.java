package Stringassignments;
/*Check whether a given string is palindrome also check whether
it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)
*/
public class Pro8 {
//	public static boolean check(String s){
		  

	public static void main(String[] args) {
		  String s="madam";
		 // System.out.println(check(s));
		  boolean b=true;
		  int c=0;
		  String s1="aeiou";
		  StringBuffer sb=new StringBuffer(s);
		  String s2=sb.reverse().toString();
		  if(!s2.equals(s))
		   b=false;
		  else{
		  		 for(int i=0;i<s1.length();i++)
		           for(int j=0;j<s.length();j++)
		            if(s1.charAt(i)==s.charAt(j)){
		             c++;
		        }
		  if(c<2)
		   b=false;
		  } 
		  System.out.println(b);
		 }
	}


