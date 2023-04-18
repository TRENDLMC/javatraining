package P_0418;

import java.util.Scanner;

public class Study01 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("정수값");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i+"의제곱은"+i*i+"입니다");
			//출력문에서 제곱을 구해줬다 i*i 값 
		}
	}

}
