package P_0417;

import java.util.Scanner;

public class Study05 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("i부터 n까지의 합을 구합니다");
		int n;
		do {
			System.out.println("n의 값");
			n=stdIn.nextInt();
			//입력 받은값으로 n을 초기화후 대입
		}while (n<=0);
		// 반복 n이 0보다작거나같으면반복
		
		int sum =0;
		//출력하기위한 sum선언및 0으로초기화
		
		for(int i=0 ; i<=n; i++) {
			//조건값 i선언 i가 n이랑 같을떄까지 실행 i증감
			sum +=i;
			// sum=sum+i
	
		}
		System.out.println("1부터"+n+"까지의합은"+sum+"입니다");
	}

}
