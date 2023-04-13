package P_0413;

import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("실수a:"); int a= stdIn.nextInt();
	System.out.println("실수b:"); int b= stdIn.nextInt();
	
	int diff= a>= b ? a-b :b-a;
	
	System.out.println("두값의 차는"+ (diff<=10?"10이하":"11이상")+"입니다");
	//시스템 프린트 메소드에서 3항논리연산자를 사용가능하다 또한사용하는 경우 ()소괄호를 입력하여 먼저 실행하게한다
	
}
}

