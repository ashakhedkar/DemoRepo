package Stringassignments;

/*2)input="hello"
output="hlo"; Alternative positions...
*/
public class Prog30 {

	public static void main(String[] args) {
		 String s="hello"; 
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<s.length();i++)
		  if(i%2==0)
		   sb.append(s.charAt(i));
		 System.out.println(sb.toString());
		}
		
}
