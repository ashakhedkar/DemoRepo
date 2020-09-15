package Stringassignments;

import java.util.StringTokenizer;

/*5)count the number of words in the string
Input string="i work in cognizant.";
output=4;
*/
public class Prog33 {
	
	public static void main(String[] args) {

		String string ="i work in cognizant ";  
	    
	         int count=0;  
	         
	         char ch[]= new char[string.length()];     
	         
	         for(int i=0;i<string.length();i++)  
	         {  
	             ch[i]= string.charAt(i);  
	             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	                 count++;  
	         }  
	         System.out.println(count); 
	   
	
	}
}
