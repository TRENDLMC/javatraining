package P_0425;

import java.util.Scanner;

public class Study01 {
	
	static int sumUp(int n) {
		int sum=0;
		for(int i=1; i<=n;i++) {
			sum +=i;
			//sum에 1씩더해서 저장해라
		}return sum;
		//위에 for문을 저장한값을 리턴해라 
	}
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.println("1부터x까지의 합을 구하자.");
		int x;
		do {
			System.out.print("x의값:");
			x=sca.nextInt();
			//숫자입력받음
		}while(x<=0);
		//0이아니면 멈춰라 
		
		System.out.print("1부터"+x+"까지의합은"+sumUp(x)+"입니다");
		// sumUP 메소드호출
	}

}
