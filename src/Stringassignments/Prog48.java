package Stringassignments;

import java.util.StringTokenizer;

/*
2)find the maximum chunk of a given string
i/p: this isssss soooo good
o/p=5
*/
public class Prog48 {
	
	public static int maximum(String str1) {
		 int max=0;
		 StringTokenizer t=new StringTokenizer(str1," ");
		 while(t.hasMoreTokens()){
		  String str2=t.nextToken();
		  int n=0;
		  for(int i=0;i<str2.length()-1;i++)
		   if(str2.charAt(i)==str2.charAt(i+1))
		    n++;
		  if(n>max)
		   max=n;
		 }
		 return (max+1);
		}

	public static void main(String[] args) {
		
		 String str1="this isssss soooooo good"; 
		 System.out.println("max chunk is : "+maximum(str1));
		
	}
			
	
}
