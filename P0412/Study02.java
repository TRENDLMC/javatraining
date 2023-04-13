package P0412;

import java.util.Scanner;


public class Study02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값");
		
		int n= stdIn.nextInt();
		
		//if (조건문) 실행문 else 실행문
		if(n>=0) {
			System.out.println("절대값은"+n+"입니다");
		}else {
			System.out.println("절대값은"+-n+"입니다");
		}
			
		

	}

}
