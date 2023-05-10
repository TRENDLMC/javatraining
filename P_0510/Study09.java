package P_0510;

import java.util.Scanner;

public class Study09 {
	
	static void printDouble(double x,int p,int w) {
		System.out.printf(String.format("%%%d.%df",w,p),x);
	}
	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		
		System.out.print("실수값:");
		double x= sca.nextDouble();
		
		System.out.print("전체 자릿수:");
		int w=sca.nextInt();
		
		System.out.print("소수점 이하자릿수");
		int p=sca.nextInt();
		
		
		printDouble(x, p, w);
		System.out.println();
	}
}
