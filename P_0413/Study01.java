package P_0413;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수a:"); double a= stdIn.nextDouble();
		System.out.println("실수b:"); double b= stdIn.nextDouble();
	
		
		double max;
		//double 타입에 max 변수를 선언
		if(a>b) {
			max =a;
			
		}else {
			max = b;
		}
		
		System.out.println("큰 쪽의ㅡ 값은 "+max+"입니다");
		
	}

}
