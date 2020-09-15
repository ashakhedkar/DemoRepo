package collection_programs;

import java.util.ArrayList;
import java.util.Scanner;

/*2. Retrieve the odd numbers till given input number.
 *  add and subtract it consecutively and return the result.
		Input:9
		Output:1+3-5+7-9=-3
*/
public class AddSubtractConsecatively 
{	
	public static void main(String[] args) 
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		ArrayList al=new ArrayList();
		for(int i=1;i<=num;i++)
			if(i%2!=0)
				al.add(i);
		int n1=(int) al.get(0);
		
		for(int i=1;i<al.size();i++)
			if(i%2!=0)
				n1=n1+(int)al.get(i);
			else
				n1=n1-(int)al.get(i);
		System.out.println(n1);
	}
}
