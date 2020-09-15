package Stringassignments;
/*Assignment 4 file
 * 1)input1="abc2012345"
input2="abc2112660"
input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb reading
find the difference between two readings and multiply it by input3

ie., output=(12660-12345)*4
*/
public class Prog17 {
	
	public static int ebReading(String input1, String input2, int input3) {
		 int num1=Integer.parseInt(input1.substring(5, input1.length()));
		 int num2=Integer.parseInt(input2.substring(5, input2.length()));
		 int num=Math.abs((num2-num1)*input3);
		 return num;
		}
		
	public static void main(String[] args) {

			 String input1="abc2012345";//last month eb=12345
			 String input2="abc2112660";//this month eb=12660
			 int input3=4;
			 System.out.println("result="+ebReading(input1,input2,input3));
				
	}
			
		
		
		
		
	}


