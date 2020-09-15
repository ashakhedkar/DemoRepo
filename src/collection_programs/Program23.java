package collection_programs;

import java.util.HashMap;
import java.util.Iterator;

public class Program23 
{
/*	23) In a hashmap if key is odd then find average of value as integer
ex: h1={1:4,2:6,4:7,5:9}
    output=(4+9)/2 */

	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> m1=new HashMap<Integer, Integer>();
		 m1.put(1, 4);
		 m1.put(2, 6);
		 m1.put(4, 7);
		 m1.put(5, 9);
		 
		 int l=0,m=0;
		 Iterator<Integer> i=m1.keySet().iterator();
		 while(i.hasNext()){
		  int n= i.next();
		  if(n%2!=0){
		   m+=m1.get(n);
		   l++;
		   } 
		  }
        System.out.println(m/l);
		
	}

}
