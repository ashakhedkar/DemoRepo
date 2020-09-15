package Stringassignments;
/*19) In a string check whether all the vowels are present
if yes return 1 else 2.
ex: String 1="education"
    output=1.

*/
public class Prog45 {
	
	public static int containsVowels(String s1) {
		int n=0;
	 for(int i=0;i<s1.length();i++){
	  char c=s1.charAt(i);
	  if((c=='a' || c=='A') || (c=='e' || c=='E') || (c=='i' || c=='I') || (c=='o' || c=='O') || (c=='u' || c=='U')){

	 	  n=1;
	  }
	  else
		  n=2;
	}
	 return n;
}
	
public static void main(String[] args) {
		 String s1="educatin";
		 System.out.println(containsVowels(s1));
	}
		}


