package collection_programs;

import java.util.HashMap;
import java.util.Iterator;

public class Program22 
{
/*	22)HashMap<String,Integer> h1={“abc”:50,”efg”:70};
    if the mark is less than 60 then put the output in the
    HashMap<String,String> h2={“abc”:”fail”,”efg”:”pass”}*/

	public static void main(String[] args) 
	{
		 HashMap<String, Integer> m1=new HashMap<String, Integer>();  
		 m1.put("abc", 90);
		 m1.put("efg", 50);
		 m1.put("mno", 60);
		 m1.put("rst", 75);
		 m1.put("xyz", 35);
		 HashMap<String,String> m2=new HashMap<String, String>();
		 String s1=new String();
		 String s2=new String();
		 int n=0;
		 Iterator<String> i=m1.keySet().iterator();
		 while(i.hasNext()){
		  s1=(String) i.next();
		  n=m1.get(s1);
		  if(n>=60)
		   s2="PASS";
		  else
		   s2="FAIL";
		  m2.put(s1, s2); }
		 System.out.println(m2);

	}

}
