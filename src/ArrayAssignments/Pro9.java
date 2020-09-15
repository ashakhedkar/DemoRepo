package ArrayAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Retrieve the palindorme-true number set from given number
  limit and return the sum
  input1:90 input2:120
  logic:99+101+111
  output:311
*/

public class Pro9 {
	 public static int PalindromeNoSum(int num1,int num2){
		  List<Integer> list=new ArrayList<Integer>();
		  
		  for(int i=num1;i<=num2;i++){
		      int r=0,
		      num3=i;
		        while(num3!=0){
		         r=(r*10)+(num3%10);
		         num3=num3/10; }
		       if(r==i)
		        list.add(i); 
		       }
		         System.out.println(list);
		         int sum=0;
		          for(int i=0;i<list.size();i++)
		            sum=sum+list.get(i);
		             return sum;
		 }
	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter the range:");
		  int num1=scan.nextInt();
		  int num2=scan.nextInt();
		  System.out.println("sum of palindrome numbers within given range is:"+PalindromeNoSum(num1,num2));
				
	}

}
