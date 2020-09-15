package DateAndTimeAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

/*6. Given date in dd-MM-yyyy format.
 * return the month in full name format(January)
input:"23-01-2012"
output:January
*/
public class Pro2 {

	public static void main(String[] args) {

			  Date date=new Date(23-01-2012);
			  
			  SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
			  String s=(sdf.format(date));
			  System.out.println(s);
					
		
	}

}
