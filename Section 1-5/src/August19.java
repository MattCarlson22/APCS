
public class August19 {

	public static void main(String[] args) {
		int num1 = 21;
		int num2 = 3;
		
		System.out.println("num1: "+num1+" - num2: "+num2);
		
		int result = num1 + num2;
		
		System.out.println("result: "+result);
		
		double val1 = 1.2;
		double result2 = val1 + num1; //22.2
		System.out.println("result2: "+result2); //22.2
		int result3 = (int)(val1 + num1); //casted as an int and data lost
		System.out.println("result3: "+result3); //22
		
		double result4 = num1 +num2; //24.0
		System.out.println("result4: "+result4);
		
		System.out.println(num1+num2+" num1 added to num2"); //24
		System.out.println("num1 aded to num2 "+num1+num2); //213
		
		int result5 = num1 - num2; //18
		System.out.println("result5: "+result5);
		System.out.println("result5: "+(num1 - num2));
		
		double result6 = num1 - val1; //19.8
		System.out.println("result6: "+result6);
		
		int result7 = num1 * num2; //63
		System.out.println("result7: "+result7);
		
		double result8 = num2 * val1; //~3.6
		System.out.println("result8: "+result8);
		
		double result9 = 20 * .5; //10.0
		System.out.println("result9: "+result9);
		
		int result10 = num1 / num2; //21 / 3 = 7
		System.out.println("result10: "+result10);
		
		int num3 = 2;
		int result11 = num1 / num3; //21 / 2 = 10.5
		System.out.println("result11: "+result11); //10
		System.out.println("21 / 2 = "+ 21 / 2.0);
		
		double result12 = num1 / (num3 * 1.0); 
		System.out.println("result12: "+result12); //10.5
		
		result12 = num1 / (double)num3; 
		System.out.println("result12 with cast: "+result12); //10.5
		
		result12 = num1 / num3; 
		System.out.println("result12 with cast: "+result12); //10.0
		
	}

}
