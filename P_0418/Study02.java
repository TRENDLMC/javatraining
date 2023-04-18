package P_0418;

import java.util.Scanner;

public class Study02 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("정수값:");
		int n=stdIn.nextInt();
		
		for(int i=1,j=1; i<=n; i++,j=i*i) {
			//증갑문 j=i*i를 입력하여 반복될떄마다 i의값이바뀌면서 재실행 되어 j의값에 대입
			System.out.println(i+"의제곱은"+j+"입니다");
		}
	}

}
