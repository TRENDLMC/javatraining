package P0412;

import java.util.Scanner;


public class Study05 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("정숫값:");
		int n= stdIn.nextInt();
		
		if(n>0) {
			System.out.println("값이 양수입니다");
			
		}else if(n<0) {
			// else if 문 if문에서 또하나의 조건을 넣고싶을때 사용		
			System.out.println("값이 음수입니다");
		}else {
		System.out.println("값이 0입니다");
		}
}

}
