package ArrayAssignments;

/*20)Square root calculation of
((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
o/p should be rounded of to int;
 use logic       */
public class Prog24 {

	public static void main(String[] args) {
		
		 int x1=2, x2=4;
		 int y1=4, y2=6;
		 		
		 int result;
		 result=(int) (Math.sqrt((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)));
		 System.out.println(result);
		
	}

}
