package P_0414;

import java.util.Scanner;

public class Study11 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수를 표시합니다");
		int x;
		do {
			System.out.print("양의정수값");
			x=stdIn.nextInt();
		}while(x<=0); // x가 0보다 같거나 작으면 반복해라 
			int digit=0;
			
		while(x>0){
			digit++;// 자리값의증가
			x/=10;// 1000/10 =100 다시 ture 값이라서 반복 자리값의증가 100/10=10또 증가
		}
		System.out.println("입력한숫자는"+digit+"자리입니다");
	}

}
