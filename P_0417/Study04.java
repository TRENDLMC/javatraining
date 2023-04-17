package P_0417;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("카운트 다운을 합니다");
		int x;
		do {
			System.out.println("양의 정수값:");
			x=stdIn.nextInt();
		}while(x<=0);
		
		for(;x>=0;x--)
			//조건값을 선언하지않음 x가 0이될떄까지 반복 x는 위에서 입력받은값
		{System.out.println(x);
		// x를 계속해서출력 
		}
	}

}
