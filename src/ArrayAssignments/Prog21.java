package ArrayAssignments;

/*
5)Given an array find the largest 'span'(span is the number of elements
 between two same digits)// Use debug and track the logic
    find their sum.
	a[]={1,4,2,1,4,1,5}
	Largest span=5
*/
public class Prog21 {
	public static int span(int[] a) {
		 int max=0;
		 int p1=0;
		 int p2=0;
		 int n=0;
		 int sum=0;
		 for(int i=0;i<a.length-1;i++){   
		  for(int j=i+1;j<a.length;j++)     
		   if(a[i]==a[j])     
		    n=j;
		  if(n-i>max){
		   max=n-i;
		   p1=i;
		   p2=n; }
		 }
		 System.out.println("largest span:"+(p2-p1));
		 for(int i=p1;i<=p2;i++)
		  sum=sum+a[i];
		 return (sum);
	}
	public static void main(String[] args) {
		 int a[]={1,4,2,1,4,1,5};
		 System.out.println("sum of largest span elements:"+span(a));
						
	}

}
