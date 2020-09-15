package Stringassignments;
/*	18)String[] input1=["Vikas","Lokesh",Ashok]
expected output String: "Vikas,Lokesh,Ashok"
*/

public class Prog27 {
	
	public static void main(String[] args) {
		
		 String[] input={"Vikas","Lokesh","Ashok"};
		 
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<input.length;i++){			 
			 //converting all array strings into a single string
	        sb.append(input[i]).append(',');
		 }
			 System.out.println(sb.toString());

	}

}
