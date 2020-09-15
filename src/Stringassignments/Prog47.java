package Stringassignments;

/*1)i/p: bengal
o/p: ceogbl
if z is there replace with a
*/
public class Prog47 {

	public static void main(String[] args) {
		 String str1="bengal";
		 //next char after b-->c,e is stable,after n-->o,g is stable,after a-->b ans l is stable
		 
		 StringBuffer sb=new StringBuffer();
		 
		 for(int i=0;i<str1.length();i++){
		  char ch=str1.charAt(i);
		  if(i%2==0){
		   if(ch==122) // ASCHII value of z is 122
			   ch=(char) (ch-25);
		   else{
			   ch=(char) (ch+1);}
		    sb.append(ch);}
		  else
		   sb.append(ch);}
		 System.out.println(sb.toString());
		}
}
