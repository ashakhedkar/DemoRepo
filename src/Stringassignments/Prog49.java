package Stringassignments;

/*3)i/p1: new york
i/p2: new jersey
o/p: new y+r+
*/
public class Prog49 {
	public static void main(String[] args) {
		 String str1="New york";
		 String str2="New jersey";
		 StringBuffer sb=new StringBuffer();

		 for(int i=0;i<str1.length();i++){
			  int first=0;
		  char ch=str1.charAt(i);
		  for(int j=0;j<str2.length();j++)
		   if(ch==str2.charAt(j))
			   first=1;
		  if(first!=0)
		   sb.append(ch);
		  else
		    sb.append('+');
		  }
		 System.out.println(sb.toString());
		 
		}
	

}
