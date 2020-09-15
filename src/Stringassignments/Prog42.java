package Stringassignments;
/*
16)Return 1 if the last & first characters of a string are equal else 
    return -1. Consider case.
    Eg: Input = "this was great"
        Output= 1
        */
public class Prog42 {
	
	public static void main(String[] args) {
		 String input="this was grea";
		 int n=0;
		 if(input.charAt(0)==input.charAt(input.length()-1))
		   n=1;
		 else 
			 n=-1;
		 System.out.println(n);
	}		
}
