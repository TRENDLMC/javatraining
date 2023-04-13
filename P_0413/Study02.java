package P_0413;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수a:"); double a= stdIn.nextDouble();
		System.out.println("실수b:"); double b= stdIn.nextDouble();
	
		
		double max = a>b ? a: b;
		//3항논리연산자   true 경의 ? a:b  a의 값을 출력
		//            false 경우 ? a:b  b의 값을 출력
	
		System.out.println("큰 쪽의 값은 "+max+"입니다");
		
	}

}
