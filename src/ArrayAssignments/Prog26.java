package ArrayAssignments;

/*12)Add elements of digits:9999 
output:9+9+9+9=3+6=9;
*/
public class Prog26 {
	
	public static void main(String[] args) {
		 int num=9999;
		
		  while(num>10){
		   int l=0,m=0;
		   while(num!=0){
		    m=num%10;
		    l=l+m;
		    num=num/10; }
		   num=l;
		   continue; }
		 System.out.println(num);

}
}
