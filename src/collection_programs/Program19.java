package collection_programs;

import java.util.ArrayList;
import java.util.List;

/*	19)Collect no’s frm list1 which is not present in list2 
& Collect no’s frm list2 which is not present in list1
and store it in output1[].
ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};*/

public class Program19 
{
	
	public static int[] commonSet(List<Integer> li1, List<Integer> li2) 
	{
		 List<Integer> li3=new ArrayList<Integer>();
		 List<Integer> li4=new ArrayList<Integer>();
		 
		 li3.addAll(li1);li4.addAll(li2);
		 li1.removeAll(li2);li4.removeAll(li3);
		 li1.addAll(li4);
		 
		 int o[]=new int[li1.size()];
		 for(int j=0;j<o.length;j++)
		  o[j]=li1.get(j);
		 return o;
		}
	
	public static void main(String[] args) 
	{
		 List<Integer> l1=new ArrayList<Integer>();
		 l1.add(1);
		 l1.add(2);
		 l1.add(3);
		 l1.add(4);
		 List<Integer> l2=new ArrayList<Integer>();
		 l2.add(1);
		 l2.add(2);
		 l2.add(3);
		 l2.add(5);
		 int o[]=commonSet(l1,l2);
		 for(int i:o)
		 System.out.println(i);
	}
}
