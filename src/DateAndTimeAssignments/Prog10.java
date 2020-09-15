package DateAndTimeAssignments;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*16)no of days in a month in specific year*/

public class Prog10 {

	public static void main(String[] args) {
		Calendar ca=new GregorianCalendar(2013,Calendar.FEBRUARY,03);
		 int n=ca.getActualMaximum(Calendar.DAY_OF_MONTH);
		    System.out.println(n);
		
	}

}
