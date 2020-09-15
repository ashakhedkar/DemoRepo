package Stringassignments;

/*11)input1="aBrd";
input2="aqrbA";
input3=2;
output1=boolean true;
2nd char of ip1 and last 2nd char of ip2 show be equal
//update it
*/
public class Prog56 {
	
	public static void main(String[] args) {
		 String input1="aBrd";
		 String input2="aqrbA";
		 int input3=2;
		 boolean b=false;
		 String s1=String.valueOf(input1.charAt(input3-1));
		 String s2=String.valueOf(input2.charAt(input2.length()-input3));
		 if(s1.equalsIgnoreCase(s2))
		  b=true;
		 System.out.println(b);
		}
	

}
