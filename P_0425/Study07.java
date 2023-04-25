package P_0425;

import java.util.Scanner;

public class Study07 {
	static Scanner sca=new Scanner(System.in);
	
	static int readPlusInt() {
		int x;
		do {
			System.out.print("양의정수값");
			x=sca.nextInt();
		}while(x<=0);
		return x;
	}

	
	public static void main(String[] args) {
		int x;
		do {
			int n=readPlusInt();
			System.out.print("반대로읽으면");
			while(n>0){
				System.out.print(n%10+",");
				//521 을10으로나누고 남은값 1을출력
				//나누기 10을 한뒤 52.1에서 int타입이므로 52만남김
				//52을 10으로나눈뒤 남는값 2
				//5.2에서 2버리고 5를 10으로 나눌수없기에 5를표현 
				n/=10;
			}
			System.out.println("입니다");
			do {
				System.out.println("다시한번? <yes..1/no...0>:");
				x=sca.nextInt();
			}while(x !=0 && x != 1);
		}while(x==1);
	}
}
