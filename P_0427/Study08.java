package P_0427;

import java.util.Scanner;

public class Study08 {
	
	static int absolute(int x) {
		return x>=0?x:-x;
	}
	static long absolute(long x) {
		return x>=0?x:-x;
	}
	static float absolute(float x) {
		return x>=0?x:-x;
	}

	static double absolute(double x) {
		return x>=0?x:-x;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("int 형의 정수a의값"); int a=scanner.nextInt();
		System.out.println("long 형의 정수a의값"); long b=scanner.nextLong();
		System.out.println("float 형의 정수a의값"); float c=scanner.nextFloat();
		System.out.println("double 형의 정수a의값"); double d=scanner.nextDouble();
		System.out.println("a의절대값은"+absolute(a));
		System.out.println("b의절대값은"+absolute(b));
		System.out.println("c의절대값은"+absolute(c));
		System.out.println("d의절대값은"+absolute(d));
	
	}
}
