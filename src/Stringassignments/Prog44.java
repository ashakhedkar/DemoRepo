package Stringassignments;

import java.util.StringTokenizer;

/*
 * 18) i/p: Honesty is my best policy
o/p: Honesty
Return the maximum word length from the given string.
If there are two words of same length then,
return the word which comes first based on alphabetical order.
*/
public class Prog44 {
	public static void main(String[] args) {
		 String s1=" Honesty is my best policy aHonesty"; 
		 int max=0;
		 String s2=new String();
		 StringTokenizer st=new StringTokenizer(s1," ");
		 
		 while(st.hasMoreTokens()){
		  String s3=st.nextToken();
		  int n=s3.length();
		  if(n>max){
		   max=n;
		   s2=s3;
		   }
		  if(n==max)
		   for(int i=0;i<s3.length();i++){
		     char c1=s2.charAt(i);
		     char c2=s3.charAt(i);
		     if(c1!=c2)
		     {    
		      if(c2<c1)
		      s2=s3;
		     continue;
		     }  
		    }
		 }
      System.out.println(s2);
	}
}
