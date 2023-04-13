package P0412;

import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("정숫값");
		int n= stdIn.nextInt();
		
		if(n>0)
			if(n%5 == 0)
				System.out.println("이 값은 5로 나누어집니다");
			else {
				System.out.println("이값은 5로 나누어지지않습니다");
			}
		else {
			System.out.println("음의 정수값을 입력했습니다");
		}

	}
}
