package ArrayAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*36.Input a hashmap. Count the keys which are not divisible by 4 and return.
*/
public class Prog18 {
	public static int countKeys(Map<Integer, String> m1) {
		  int k=0;
		  Iterator<Integer> i=m1.keySet().iterator();
		  while(i.hasNext()){
		   int j=i.next();
		   if(j%4!=0)
		    k++;
		    }
		  return k;
}

	public static void main(String[] args){
		
				  Map<Integer, String> m1=new HashMap<Integer, String>();
				  m1.put(24, "hello");
				  m1.put(32, "how");
				  m1.put(25, "are");
				  m1.put(31, "you");
				  System.out.println(countKeys(m1));
	 }
				 
}
