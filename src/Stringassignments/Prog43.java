package Stringassignments;

/*17)concat two string if length of two string is equal.
if length of one string is greater, then remove the character from 
largest string and then add. The number of characters removed from 
largest string is equal to smallest string's length
for example: input 1="hello";
             input 2="helloworld";
             output="worldhello";
*/
public class Prog43 {
	
	public static void main(String[] args) {
		 String input1="hello";
		 String input2="helloworld";
		 StringBuffer sb=new StringBuffer();
		 int n1=input1.length();
		 int n2=input2.length();
		 if(n1<n2)
		  sb.append(input2.substring(n1, n2)).append(input1);
		 System.out.println(sb.toString());
		 
		}
	
}
