package Stringassignments;
/*
4)input1={2,4,3,5,6};
if odd  find square 
if even find cube
finally add it
output1=208(4+16+27+125+36)
*/
public class Prog50 {
	
	public static void main(String[] args) {
		 int a[]={2,4,3,5,6};
		 int n1=0,n2=0;
		 for(int i=0;i<a.length;i++)
		  if(a[i]%2==0)
		   n1+=(a[i]*a[i]);
		  else
		   n2+=(a[i]*a[i]*a[i]);
		 System.out.println(n1+n2);
		}

}
