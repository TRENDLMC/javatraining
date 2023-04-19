package P_0419;

import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner strIn=new Scanner(System.in);
		
		System.out.println("변수x는 float형입니다. 변수y는 double형입니다.");
		System.out.print("x:");
		float x=strIn.nextFloat();
		System.out.print("y:");
		double y=strIn.nextDouble();
		System.out.println("x="+x);
		System.out.println("y="+y);
		//float타입과 double타입의 소수점자리수 차이
	}

}
