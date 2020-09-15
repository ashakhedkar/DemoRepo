package ArrayAssignments;
/*
   Retrieve the odd numbers till given input number.

   add and subtract it consecutively(serially) and return the result.
   Input:9
   Output:1+3-5+7-9=-3
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pro8 {
	public static int addSubofOddNumbers(int n){
		  List<Integer> list=new ArrayList<Integer>();
		  for(int i=1;i<=n;i++)
		   if(i%2!=0)
		    list.add(i);
		  int num=list.get(0);
		  for(int i=1;i<list.size();i++)
		   if(i%2!=0)
		    num=num+list.get(i);
		   else
		    num=num-list.get(i);
		  return num;
		 }

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		  int n=scan.nextInt();
		  System.out.println(addSubofOddNumbers(n));
		
		
		
		
		
	}

}
