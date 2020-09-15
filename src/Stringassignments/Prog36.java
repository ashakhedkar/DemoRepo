package Stringassignments;

/*8) input---input1=1;
input2=4;
input3=1;
output1=4;
operation--- print the element which is not repeated    
if all the inputs r different sum all inputs
input---input1=1;
input2=2;
input3=3;
output1=6;*/

public class Prog36 {

	public static void main(String[] args) {
		 int input1=1,input2=4,input3=1;
		 	 int n=0;
		 if(input1!=input2 && input2!=input3 && input3!=input1)
		  n=input1+input2+input3;
		 else if(input1==input2 && input2==input3)
		  n=0;
		 else{
		  if(input1==input2)
		   n=input3;
		  else if(input1==input3)
		   n=input2;
		  else if(input2==input3)
		   n=input1;
		  }
		 System.out.println(n);
		
	
	}
		
}
