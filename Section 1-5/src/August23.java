
public class August23 {

	public static void main(String[] args) {
		
		int x = 3;
		
		x = 4;
		
		System.out.println("point a: "+x);
		
		x++;
		
		System.out.println("point b: "+x);
		
		x = x+1;
		
		System.out.println("point c: "+x);
		
		x += 1; //x=x+1
		
		System.out.println("point d: "+x);
		
		x += 24; //x=x+24
		
		System.out.println("point e: "+x);
		
		x = 125;
		
		System.out.println("point f: "+x);
		
		//x = 1.2; can't happen because loss of data
		
		System.out.println("11 / 3 = "+11/3);
		
		x = 11/3;
		
		System.out.println("11 / 3.0 = "+11/3.0);
		
		System.out.println("Math.ceil(11 / 3.0) = "+Math.ceil(11/3.0));
		
		System.out.println("Math.floor(11 / 3.0) = "+Math.floor(11/3.0));
		
		//x += 24;
		
		x -= 2; // x = x - 2
		
		System.out.println("point g: "+x);
		
		x = 3;
		
		x *= 4; // x = x * 4
		
		System.out.println("point h: "+x);
		
		x /= 5; // x = x / 5
		
		System.out.println("point i: "+x);
		
		x = 25;
		x %= 4; // x = x % 4
		
		System.out.println("point j: "+x);
		

	}

}
