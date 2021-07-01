/**
* This program is to compare two lines and find whether two lines are equal,greater or less than other line
*
* @author  Bathala Haresh
*/

import java.util.Scanner;
import java.lang.Double;
public class LineComparision
{
	public static void main(String[] args) {
	    
	    //converting method in double to string
	    String x=Double.toString(distance());
            String y=Double.toString(distance());
        
        //comparing both the string values using compareTo method
	    double c=x.compareTo(y);
	    if(c == 0)
        {
            System.out.println("equal");
        }
        else if(c < 0 ){
            System.out.println(" Line1 is lesser and Line2 is greater ");
        }
        else{
            System.out.println("Line1 is greater and Line2 is lesser");
        }
}

    //method to calculate the length of a Line
	public static double distance()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the co-ordinates");
	    System.out.println("Enter x1 value:");
	    int x1=sc.nextInt();
	    System.out.println("Enter y1 value:");
	    int y1=sc.nextInt();
	    System.out.println("Enter x2 value:");
	    int x2=sc.nextInt();
	    System.out.println("Enter y2 value:");
	    int y2=sc.nextInt();
	    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	    
	}
}
