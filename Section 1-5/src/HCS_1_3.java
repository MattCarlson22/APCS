
import java.util.Scanner;//needed to take input from the user

import java.text.DecimalFormat;  //needed to format the decimal...not required in the assignment
public class HCS_1_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the x coordinate of point 1: ");
		double xCoord1 = sc.nextDouble();
		
		System.out.print("Please enter the y coordinate of point 1: ");
		double yCoord1 = sc.nextDouble();
		
		System.out.print("Please enter the x coordinate of point 2: ");
		double xCoord2 = sc.nextDouble();
		
		System.out.print("Please enter the y coordinate of point 2: ");
		double yCoord2 = sc.nextDouble();
		
		double distance = Math.sqrt(((xCoord2-xCoord1)*(xCoord2-xCoord1))+((yCoord2-yCoord1)*(yCoord2-yCoord1)));
		
		DecimalFormat fmt = new DecimalFormat("#.###");
		
		System.out.println("The distance between ("+xCoord1+","+yCoord1+") and ("+xCoord2+","+yCoord2+") is approximately "+fmt.format(distance));
		sc.close();
	}

}