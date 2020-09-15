package DateAndTimeAssignments;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
21.  Find the number of days between two input dates. 
*/
public class Pro6 {

		public static void main(String[] args) throws Exception {
		 String s1="22/12/2018";
		 String s2="01/09/2019";
		 SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		 Date d=sd.parse(s1);
		 Calendar c=Calendar.getInstance();
		 c.setTime(d);
		 long d1=c.getTimeInMillis();
		 d=sd.parse(s2);
		 c.setTime(d);
		 long d2=c.getTimeInMillis();
		 int n=Math.abs((int) ((d1-d2)/(1000*3600*24)));
		 System.out.println(n);
		 }
	
}
