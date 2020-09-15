package Stringassignments;
/*String encrption. replace the odd-index character
with next character(if it is 'z' replace with 'a'..if 'a' with 'b' as such),
leave the even index as such. return the encrypted string.
*/
public class Prog13 {

	public static void main(String[] args) {
		 String s="preethi";
		 System.out.println(encript(s));
		 }
		public static String encript(String s) {
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<s.length();i++){
		  char c=s.charAt(i);
		  if(c%2!=0){
		   c=(char)(c+1);
		   sb.append(c);  }
		  else
		   sb.append(c);   }
		 return sb.toString();
	}

}
