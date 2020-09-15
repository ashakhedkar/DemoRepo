package DateAndTimeAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

/*10)What will be the DAY of current date in next year*/
public class Pro9 {
	public static void main(String[] args) {
		 Date date1=new Date();
		 Date date2=new Date();
		 date2.setYear(date1.getYear()+1);
		 SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		 String str=sdf.format(date2);
		 System.out.println("day of current date is: "+str);
		 
		}
}
