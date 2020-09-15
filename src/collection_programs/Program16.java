package collection_programs;

import java.util.ArrayList;

public class Program16 
{
/*	16)Input1={“ABX”,”ac”,”acd”};
	   Input2=3;
	   Output1=X$d
	   */

	public static void main(String[] args) 
	{
		 String[] s1={"abc","dah","ram","cat"};
		 int ip=3;
		 String op=" ";
		 String s2=" ";
		 
		 ArrayList<String> l1=new ArrayList<String>();
		 for(String s:s1)
		  if(s.length()==ip)
		  l1.add(s); 
		 StringBuffer sb=new StringBuffer();
		 
		 for(String l:l1){
		     s2=l.substring(l.length()-1);
		     sb.append(s2).append("$"); }
		 op=sb.deleteCharAt(sb.length()-1).toString();
		 System.out.println(op);		
	}

}
