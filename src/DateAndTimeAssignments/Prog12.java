package DateAndTimeAssignments;

import java.util.GregorianCalendar;

/*13)leap year or not using API?*/

public class Prog12 {
	public static void main(String[] args) {
		 String s="2013";
		 System.out.println(leapYear(s));
		}
		public static boolean leapYear(String s) {
		 int n=Integer.parseInt(s);
		 GregorianCalendar c=new GregorianCalendar();
		 boolean b=c.isLeapYear(n);
		 return b;
		}

}
