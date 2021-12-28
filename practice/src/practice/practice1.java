package practice;

public class practice1 {

	public static void main(String[] args) {
		// 巩力 1
		int x = -5;
		int y = 10;
		int result1 = -x;
		System.out.println("result1=" + result1);
		int result2 = (++x)+(y--);
		System.out.println("result2=" + result2);
		int result3 = (++x)+(--y);
		System.out.println("result3=" + result3);
		
		// 巩力 2
		int m = 10;
		int n = 5;
		
		System.out.println( !( m*2 == n*4 ) || !( n<=5 ) );
		System.out.println( !( m/2 > 5) && !( n%2 < 1) );
 
		// 巩力 3
		int val = 0;
		
		val += 10;
		System.out.println("val =" + val);
		val -= 5;
		System.out.println("val =" + val);
		val *= 3;
		System.out.println("val =" + val);
		val /= 5;
		System.out.println("val =" + val);
		// 巩力 4
		val = val > 0 ? val : 0 ;
		System.out.println("val =" + val);
		
		// 巩力 5
		int a = 10;
		int b = -8;
		if((a <= 0) || (b <= 0)) {
			System.out.println("One of a or b is negative number");
		}else {
			System.out.println("both a and b are zero or more");
		}		
		
	}

}
