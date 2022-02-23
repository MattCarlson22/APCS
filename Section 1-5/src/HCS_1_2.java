import java.util.Scanner;

public class HCS_1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input the first whole number: ");
		int wholeNumber1 = sc.nextInt();
		
		System.out.print("Please input the second whole number: ");
		int wholeNumber2 = sc.nextInt();
		
		System.out.print("Please input a decimal number: ");
		double decimalNumber = sc.nextDouble();
		
		System.out.println("You input the values "+wholeNumber1+", "+wholeNumber2+" and "+decimalNumber);
		
		double sum = wholeNumber1 + wholeNumber2 + decimalNumber;
		double product = wholeNumber1 * wholeNumber2 * decimalNumber;
		double average = (wholeNumber1 + wholeNumber2 + decimalNumber)/3;
		
		System.out.println("The sum of the 3 values you entered is: "+sum);
		System.out.println("The product of the 3 values you entered is: "+product);
		System.out.println("The average of the 3 values you entered is: "+average);
		System.out.println("The last digit of the first number you input is: "+(wholeNumber1%10));
		sc.close();
	}//main

}//HCS_1_2