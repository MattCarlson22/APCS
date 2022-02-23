import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the diameter of a circle in inches: ");
		double diameter = sc.nextDouble();
		
		double radius = diameter / 2;
		double area = (Math.PI*(radius*radius));
		
		DecimalFormat fmt = new DecimalFormat("#.##");
		
		System.out.println("The area of that circle is around "+fmt.format(area)+" inches squared");
		sc.close();
	}

}
