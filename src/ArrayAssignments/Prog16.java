package ArrayAssignments;
/*Retrieve the non-prime numbers within the range of a given input....logic update
Add-up the non-prime numbers and return the result.
*/
//
import java.util.ArrayList;
import java.util.List;

public class Prog16 {
	 public static int addNonPrimenumbers(int i, int j){
		  int k=0;
		  List<Integer> list1=new ArrayList<Integer>();
		  List<Integer> list2=new ArrayList<Integer>();
		  for(int a=i;a<=j;a++){
		   int c=0;
		   for(int b=2;b<a;b++)
		    if(a%b==0)
		     c++;
		   if(c==0)
			   list1.add(a); }
		   for(int e=i;e<=j;e++)
			  list2.add(e);
		   list2.removeAll(list1);
		   for(int d=0;d<list2.size();d++)
		   k=k+list2.get(d);
		   return k;
		 		 
     }
	public static void main(String[] args) {

				  int i=20, j=40;
				  System.out.println("sum of non-prime nos. is:"+addNonPrimenumbers(i,j));
				  }
				
}
