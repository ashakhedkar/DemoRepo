package collection_programs;

import java.util.HashMap;
import java.util.Iterator;

public class Program25 
{
	/*25)HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
    String[] input2={“speaker”,”mouse”};
    Float output=600.80(500.6+100.2);*/

	public static void main(String[] args) 
	{
		 HashMap<String, String> m1=new HashMap<String, String>();
		 m1.put("mouse", "100.2");
		 m1.put("speaker","500.6");
		 m1.put("monitor", "2000.23");
		 
		 String[] s={"monitor","mouse"};
		 
		 float sum=0;
		
		 Iterator<String> it=m1.keySet().iterator();
		 
		 while(it.hasNext())
		 {
		 String s1 = it.next();
		 float f1=Float.parseFloat(m1.get(s1));
		 
		 for(int i=0;i<s.length;i++)
		  if(s[i].equals(s1))
		   sum=sum+f1; 
		 }
		 System.out.println(sum);
	}

}
