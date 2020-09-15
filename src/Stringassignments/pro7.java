package Stringassignments;
/*Find if a given pattern appears in both the input strings at same
 *  positions.
 input1: "hh--ww--"
 input2: "rt--er--"
 output: true(false otherwise)
*/

public class pro7 {
	 public static boolean display(String s1,String s2){
		  String str1=s1.length()<s2.length()?s1:s2;
		  String str2=s1.length()>s2.length()?s1:s2;
		        boolean b=true;
		        String s=str2.substring(str1.length());
		     if(s.contains("-"))
		       b=false;
		     else{
		     for(int i=0;i<str1.length();i++)
		      if((str1.charAt(i)=='-') || (str2.charAt(i)=='-'))
		       if(str1.charAt(i)!=str2.charAt(i)){
		         b=false;
		          }
		      }
		     return b;
		 }

	public static void main(String[] args) {

		 String s1="he--ll--";
		  String s2="we-ll--";
		  boolean b;
		  b=display(s1,s2);
		  if(b==true)
		   System.out.println("true");
		  else
		   System.out.println("false");
	}
}
