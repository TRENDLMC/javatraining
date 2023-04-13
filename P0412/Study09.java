package P0412;

import java.util.Scanner;

public class Study09 {	
	public static void main(String[] args) {

		Scanner stdIn=new Scanner(System.in);
		System.out.println("정수값");
		int n= stdIn.nextInt();
		
		if(n> 0 ) {
			if( n%10 == 0) {
				//if안에 또다시 if문을 넣을수도있다
				System.out.println("이 값은 10의 배수입니다");
			}else {
			 
				System.out.println("이 값은 10의 배수가 아닙니다");
		}
		
		}else {
			System.out.println("음의 정수값을 입력했습니다");
		}
	}
}
