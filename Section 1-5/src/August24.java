import java.util.Scanner;
public class August24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input a whole number > ");
		int input = sc.nextInt();
		System.out.println("Two times your input is > "+input*2);
		
		System.out.print("Please input a double value > ");
		double doubleInput = sc.nextDouble();
		System.out.println("doubleInput value is > "+doubleInput);
		
		System.out.print("Please give a random input > ");
		sc.nextLine();
		String stringInput = sc.nextLine();
		System.out.println("String > "+stringInput);
		sc.close();
		

	}

}
