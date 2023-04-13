package P_0413;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("실수a:"); int a= stdIn.nextInt();
	System.out.println("실수b:"); int b= stdIn.nextInt();
	
	int diff= a>= b ? a-b :b-a;
	//3항논리연산자
	

	System.out.println("두 값의 차는 "+diff+"입니다");
}
}

