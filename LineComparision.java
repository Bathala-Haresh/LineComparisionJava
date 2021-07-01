
/**
* This program is to calculate the Length of a Line
*
* @author  Bathala Haresh
*/
import java.util.Scanner;
public class LineComparision {

	        public static void main(String args[])
	        {
	        	//variables
	            int x1,y1,x2,y2;
	            double length;
	            
	            Scanner sc=new Scanner(System.in);
	            System.out.println("enter line coOrdinates  ");
	            
	            System.out.print("x1 : ");
	            x1=sc.nextInt();
	            
	            System.out.print("x2 : ");
	            x2=sc.nextInt();
	            
	            System.out.print("y1 : ");
	            y1=sc.nextInt();
	            
	            System.out.print("y2 : ");
	            y2=sc.nextInt();
	            
	            //Formula to calculate the length of a line
	            length=Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	            
	            System.out.print("length between two lines is : " +length);
	        }
	    }


