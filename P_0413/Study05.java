package P_0413;

import java.util.Scanner;

public class Study05 {
	public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("실수a:"); int a= stdIn.nextInt();
	System.out.println("실수b:"); int b= stdIn.nextInt();
	
	int diff= a>= b ? a-b :b-a;
	

	if( diff <=10) {
		//3항 논리연산자의값에 비교연산자를 사용하여 10보다 크냐 작냐를 판변
		System.out.println("두 값의 차는 10이하 입니다");
	}else {
		System.out.println("두 값의 차는 10이상 입니다");
	}
}
}

