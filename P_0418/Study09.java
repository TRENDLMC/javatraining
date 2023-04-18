package P_0418;

import java.util.Scanner;

public class Study09 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n;
		do {
			System.out.print("2이상의 정숫값:");
			n=stdIn.nextInt();
		}while(n<2);
		int i;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				//n나누기i는n보다작은 모든값이대입된다
				//만약 이값중에서 완전하게 나눠진다면 while문이종료된다
				break;
			}
		}
		if(i==n) {
			//그후n의값이 같다면 마지막대입떄 증감되었으므로i와n은같을수밖에없는데 같다면 소수가맞다
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
	}
}