package P_0502;

import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("실수값:");
		double x=sca.nextDouble();
		
		System.out.println("절대값"+Math.abs(x));
		System.out.println("제곱근"+Math.sqrt(x));
		System.out.println("면 적"+Math.PI*x*x);
	}

}
