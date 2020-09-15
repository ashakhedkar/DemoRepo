package Stringassignments;
/*4)String array will be given.
 * if a string is Prefix of an any other 
 * string in that array means count. //update logic*/
public class Prog32 {

	public static void main(String[] args) {
		 
		String[] a={"india","Austrelia","Austria","indies","America"};
		 int n=0;
		 for(int i=0;i<a.length;i++)
		  for(int j=i+1;j<a.length;j++){
		  String s1=a[i];
		  String s2=a[j];
		  if(s2.startsWith(s1)||s1.startsWith(s2))
			  
		   n++; 
		  }
		 System.out.println(n);
		 
		}
		
}
