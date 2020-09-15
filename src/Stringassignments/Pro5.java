package Stringassignments;

/*38.  input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2
*/

public class Pro5 {
	public static int stringSearching(String str1, String str2, String str3) {
		 int n=0;
		 int n1=str1.indexOf(str2);
		 int n2=str1.indexOf(str3);
		 if(n1<n2){
		  n=1;
		 System.out.println(n);
		 }
		 else
		 {
		  n=2;
		 System.out.println(n);
		 }
		 return n;
	}

 public static void main(String[] args) {
			 
		 String str1="GeniusDevkumarRaj";
		 String str2="Dev";
		 String str3="Raj";
		 int n=stringSearching(str1,str2,str3);
		 
	 }
}
