package Stringassignments;

/*13)prove whether a number is ISBN number or not
input="0201103311"
ISBN number:  sum=0*10 +2*9+ 0*8 +1*7+ 1*6 +0*5+ 3*4 +3*3+ 1*2 +1*1
sum%11==0 then it is ISBN number
*/
public class Prog39 {
	
	public static void main(String[] args) {
			
		 String ip="0201103311";
		 boolean b=false;
		 int sum=0;
		 for(int i=0,j=ip.length();i<ip.length();i++,j--){
			 
		  String s=String.valueOf(ip.charAt(i));
		  int n=Integer.parseInt(s);
		  sum+=(n*j); 
		  }
		 if(sum%11==0)
		  b=true;
		 if(b==true)
		  System.out.println("This is ISBN number");
		 else
		  System.out.println("This not ISBN number");
		  
		

	}
}
