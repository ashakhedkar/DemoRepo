package DateAndTimeAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

/*2.Find the day(Friday) of a date input given as MM-dd-yyyy (format)
input:12-27-2012
output:Thursday
*/
public class Pro1 {
	public static void main(String[] args) {

		 Date date=new Date(15-02-2019);
		  String str;
		  //EEEEE= provides day name in week
		  SimpleDateFormat sdf=new SimpleDateFormat("EEEEE");
		  str=sdf.format(date);
		  System.out.println("day is:"+str);
 
		/*
		Date date=new Date();
		System.out.println(date.compareTo(date));
		*/
		
		
	}

}
