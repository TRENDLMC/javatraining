package P_0417;

import java.util.Scanner;

public class Study03 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("카운트 업을 합니다");
		int x;
		do {
			System.out.print("양의 정수값:");
			x=stdIn.nextInt();
			//int x의 값을 초기화
		}while(x<=0);
		//x가 0이랑 같거나작으면 반복
		
		for(int y=0; y<x; y++)
			//변수y선언 y가 x보다 작으면 계속실행 y증감 
			//y<=x를 붙이면 x의 값까지 출력 <는 x보다 하나작게 출력 or1
		{System.out.println(y);
		//y의값을 출력 
		}
		
		System.out.println(x);
		//요렇게하면 x까지지카운트함 or2
		
		
	}

}
