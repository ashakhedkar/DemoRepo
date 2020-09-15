package Stringassignments;
/*14)for the given string display the middle 2 value, 
 * case satisfies only if string is of even length
ip - java
op - av
*/
public class Prog25 {

	public static String caseSatisfies(String s1) {
		//return middle two letters if length is even
	 String s2=s1.substring((s1.length()/2)-1,(s1.length()/2)+1);
	 return s2;
	}
	
	public static void main(String[] args) {

		 String s1="sumithra";
		 System.out.println(caseSatisfies(s1));
		
		
	}

}
