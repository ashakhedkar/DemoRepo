package Stringassignments;
/*input1="Rajasthan";
input2=2;
input3=5;
output=hts;
*/
public class Prog14 {
	public static String retrieveString(String input1, int input2, int input3) {
		  StringBuffer sb=new StringBuffer(input1);
		  sb.reverse(); //nahtsajaR
		  String output=sb.substring(input2, input3);
		  return output;
		 }

	 public static void main(String[] args) {
		 
	  String input1="Rajasthan";
	  int input2=2, input3=5;
	  System.out.println(retrieveString(input1,input2,input3));
	  
	 }
	 	}
