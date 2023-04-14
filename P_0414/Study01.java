package P_0414;

import java.util.Scanner;

public class Study01 {
	public static void main(String[] args) {
		
		Scanner stdInt= new Scanner(System.in);
		int retry;
		
		
		do {
			System.out.println("정수값");
			int n=stdInt.nextInt();
			
			if(n>0) {
				System.out.println("이 값은 양수입니다");
			}else if(n<0) {
				System.out.println("이 값은 음수입니다");
			}else {
				System.out.println("이 값은 0입니다");
			}
			System.out.println("다시한번 ? 1-yes /0-no:");
			retry =stdInt.nextInt();
			// retry 1~2
			
			}while (retry ==1);// retry값이 1과같다면 반복문을 다시실행
			
		}
	}


