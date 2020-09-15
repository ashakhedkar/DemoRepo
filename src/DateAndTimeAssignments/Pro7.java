package DateAndTimeAssignments;

import java.util.StringTokenizer;

/*
34. Return the number of days in a month, 
where month and year are given as input.
*/

public class Pro7 {
	 public static void main(String[] args){
		  String s1="04/2019";
		  int n=0;
		  StringTokenizer r=new StringTokenizer(s1,"/");
		  int n1=Integer.parseInt(r.nextToken());
		  int n2=Integer.parseInt(r.nextToken());
		  if(n1==1 || n1==3 || n1==5 ||n1==7 || n1==8 || n1==10 || n1==12)
		   n=31;
		  else if(n1==4 || n1==6 || n1==9 || n1==11)
		   n=30;
		  else if(n1==2){
		   if(n2%4==0)
		    n=29;
		   else
		    n=28; 
		   }
		  System.out.println(n);
		
}
}
