package DateAndTimeAssignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
11) String i/p1=2012;
sTRING i/p2=5
IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;
*/
public class Prog11 {
	
	public static void main(String[] args) throws ParseException {
		
		 String input1="2012"; 
		 String input2="5";
		 boolean b=false;
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		  Date d1=sdf.parse(input1);
		  Date d2=new Date();
		 int n1=d1.getYear();
		 int n2=d2.getYear();
		 int n3=Integer.parseInt(input2);
		 if((n2-n1)>n3)
		  b=true;
		System.out.println(b);
		
		}
	
	}
