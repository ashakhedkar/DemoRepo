package Stringassignments;
/*3)Input1=”Hello World”;  
 * output-------à  “dello WorlH”.
 * */
public class Prog31 {
	public static void main(String[] args) {
		 String s="Hello World"; 
		 StringBuffer sb=new StringBuffer();
		 sb.append(s.substring(s.length()-1));
		 sb.append(s.substring(1, s.length()-1));
		 sb.append(s.substring(0, 1));
		 System.out.println(sb.toString());
		}

}
