package Stringassignments;

/*7)Input1=”cowboy”; Output1=”cowcow”;
Input1=”so”;output1=”sososo”; 
HINT: if they give 3 letter word u have to display 2 time; 
//Check logic 
*/
public class Prog35 {

	public static void main(String[] args) {
		 String input1="so";
		 String input2="so";
		 StringBuffer sb=new StringBuffer();
		 int n1=input2.length();
		 if(n1==3)
		  for(int i=0;i<n1-1;i++)
		   sb.append(input1.substring(0, n1));
		 else if(n1==2)
		  for(int i=0;i<n1+1;i++)
		   sb.append(input1.substring(0, n1));
		System.out.println(sb.toString());
		}
	
	
	
}
