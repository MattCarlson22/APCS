import java.util.Scanner;
import java.text.DecimalFormat;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the length of side 1: ");
		int sA = sc.nextInt();
		
		System.out.print("Please enter the length of side 2: ");
		int sB = sc.nextInt();
		
		System.out.print("Please enter the length of side 3: ");
		int sC = sc.nextInt();
		
		int s = (sA + sB + sC)/2;
		double area = Math.sqrt(s*(s-sA)*(s-sB)*(s-sC));
		DecimalFormat fmt = new DecimalFormat("#.##");
		System.out.println("The area of your triangle is "+fmt.format(area));
		sc.close();
	}

}
