package Stringassignments;
/*
6)input={"1","2","3","4"}
    output=10
    ie, if string elements are nos,add it.
    input={"a","b"}
    output=-1;
    */

public class Prog19 {

	public static int nosElements(String[] s) {
		 int n=0;
		 boolean b=false;
		 for(int i=0;i<s.length;i++){
		  String s1=s[i];
		  for(int j=0;j<s1.length();j++){
		   char c=s1.charAt(j);
		   if(Character.isDigit(c))
		    b=true;
		   else{
		    b=false;
		    break;
		    }
		   }
		  if(b==true)
		   n+=Integer.parseInt(s1);
		  else{
		   n=-1;
		   break;
		   }
		  }
		 return n;
	}
	public static void main(String[] args) {
					 
		 String s[]={"a","b"};
		 System.out.println(nosElements(s));
		
		

	}

}
