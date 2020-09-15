package Stringassignments;
/*
20)swap the every 2 chrecters in the given string 
If size is odd number then keep the last letter as it is.
Ex:- input: forget
 output: ofgrte
Ex:- input  : NewYork
     output : eNYwrok
*/
public class Prog46 {
	
	public static void main(String[] args) {
		 String str1="NewYork";
		 StringBuffer sb=new StringBuffer();
		 int len=0;
		 if(str1.length()%2==0)
			 len=str1.length();
		 else
			 len=str1.length()-1;
		 
		 for(int i=0;i<len;i=i+2){
		  String str2=(str1.substring(i, i+2));
		  StringBuffer sb1=new StringBuffer(str2);
		  sb.append(sb1.reverse());
		  }
		 
		 String str3=new String();
		 if(str1.length()%2==0)
		  str3=sb.toString();
		 else
		  str3=sb.append(str1.charAt(str1.length()-1)).toString();
		 System.out.println(str3);
		 
		}

}
