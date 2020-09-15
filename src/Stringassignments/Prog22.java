package Stringassignments;
/*
11)Get all the numbers alone from the string and return the sum.
*/
public class Prog22 {
	
	public static int sumAloneNos(String s) {
		 int n=0;
		 for(int i=0;i<s.length();i++){
		  char c=s.charAt(i);
		  if(Character.isDigit(c)){
		   String s1=String.valueOf(c);
		   n+=Integer.parseInt(s1);} }
		 return n;
		}
	
	public static void main(String[] args) {
		
		 String s="hi23";
		 System.out.println(sumAloneNos(s));
		
	}

}
