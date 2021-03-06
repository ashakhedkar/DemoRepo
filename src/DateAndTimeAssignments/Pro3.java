package DateAndTimeAssignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*7. Two dates are given as input in "yyyy-MM-dd" format.
 *  Find the number of months between the two dates
input1:"2012-12-01"
input2:"2012-01-03"
output:11
*/
public class Pro3 {
	
	public static void main(String[] args) throws ParseException {
		  String s1=new String("2012-12-01");
		  String s2=new String("2012-01-03");
		  
		  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		  Calendar c=Calendar.getInstance();
		  Date d1=sdf.parse(s1);
		  Date d2=sdf.parse(s2);
		  c.setTime(d1);
		  int m1=c.get(Calendar.MONTH);
		  int y1=c.get(Calendar.YEAR);
		  c.setTime(d2); 
		  int m2=c.get(Calendar.MONTH);
		  int y2=c.get(Calendar.YEAR);
		  int n=(y1-y2)*12+(m1-m2);
		  System.out.println(n);
		  
		  
		 }
	
	
	
	
}
