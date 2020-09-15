package Stringassignments;

/*9)find the no.of charcters,that has repeated 3 consecutive times
input1:"aaabbccc"
ouput1=2;
*/
public class Prog21 {

	public static int repeatedChar(String input1) {
	 int count=0;
	 int num=0;
	 for(int i=0;i<input1.length()-1;i++){
	  if(input1.charAt(i)==input1.charAt(i+1))
	   num++;
	  else
	   num=0;	  
	  if(num==2)
		  count++; 
	  }
	 return count;
	}

	public static void main(String[] args) {

		 String input1="aaabbccc";
		 System.out.println(repeatedChar(input1));
						
	}

}
