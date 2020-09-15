package Stringassignments;

/*compare two strings, if the characters in string 1 are present in

  string 2, then it should be put as such in output, else '+' should be
  put in output...ignore case difference.
		input 1:"New York"
		input 2:"NWYR"

		output:N+w+Y+r+
	*/
import java.util.Scanner;
public class Pro2 {
	public static void main(String[] args) {
		
        Scanner scan= new Scanner(System.in);
        String str1,str2,str3;
        System.out.println("enter first string");
		str1=scan.nextLine();
        System.out.println("enter Second string");
	    str2=scan.nextLine();
		
		StringBuilder sb= new StringBuilder();
        str3=str1.toUpperCase();

		for(int i=0;i<str2.length();i++)
		{
                for(int j=0;j<str3.length();j++)
                {
                	if(str2.charAt(i)==str3.charAt(j))
                	{
                		sb.append(str1.charAt(j)).append('+');
                	}
                }
		}	
		System.out.println(sb);
	}
}
	