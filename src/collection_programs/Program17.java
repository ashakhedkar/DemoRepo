package collection_programs;

import java.util.ArrayList;

public class Program17 
{
	/*17)String[] input={"100","111","10100","10","1111"} input2="10"
		 output=2;
		 count strings having prefix"10" but "10" not included in count
		 operation-- for how many strings input2 matches the prefix of each string in input1
		 String[] input={"01","01010","1000","10","011"}
		output=3; count the strings having prefix"10","01" but "10","01" not included*/

	public static void main(String[] args) 
	{
		 String[] ip={"100","10","100","10","0111"};
		 int op=0;
		 
		 ArrayList<String> list=new ArrayList<String>();
		 
		 for(String s:ip)
			 
		  if((s.startsWith("10") || s.startsWith("01")) &&(s.length()>2))
			  
		  list.add(s);
		 
		 op=list.size();
		 
		 System.out.println(op);

	}

}
