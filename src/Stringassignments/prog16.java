package Stringassignments;

import java.util.Scanner;

/*input="xyzwabcd"
intput2=2;
input3=4;
output=bawz
*/
public class prog16 {

	public static void main(String[] args) {
		String str1="xyzwabcd";
		 int n1=2,n2=4;
		 System.out.println(retrieve(str1,n1,n2));
		}

		public static String retrieve(String str1, int n1, int n2) {
		 StringBuffer sb=new StringBuffer(str1);
		 sb.reverse();
		 String str2=sb.substring(n1, n1+n2);
		 return str2;
	}

}
