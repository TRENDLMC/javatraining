package P_0417;

import java.util.Scanner;

public class Study01 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정수값:");
			n=stdIn.nextInt();
		} while (n<=0);
		
		int factorial=1;
		//저장값
		int i=1;
		//반복문을 위한 조건값 
		while(i<=n) {
			factorial *= i;
			//factorial *= factorial x i를 조건충족까지 반복
			i++;
			//i의 값을 증감 
		}
		System.out.println("1부터"+n+"까지의 곱은"+factorial+"입니다");
	}

}
