package collection_programs;

import java.util.HashMap;
import java.util.Iterator;
/*Q.6--HashMap with regnum as key and mark as value. 
 * find the avg of marks whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90
*/
public class FindAvgOfMarksWhoseKeyOdd 
{	
	 public static int averageOfMarks(HashMap<Integer,Integer> hm)
	 {
		  int num=0,count=0;
		  Iterator<Integer> i=hm.keySet().iterator();
		  while(i.hasNext()){
		   Integer b=i.next();
		   if(b%2!=0){
		    count++;
		    num+=hm.get(b);
		    } 
		   }
		  return (num/count); 
	 }
	 
	public static void main(String[] args) 
	{
		 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 hm.put(367, 89);
		 hm.put(368, 98);
		 hm.put(369, 92);
		 hm.put(366, 74);
		 hm.put(365, 67);
		 System.out.println(averageOfMarks(hm));		
	}
}
