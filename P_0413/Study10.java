package P_0413;

import java.util.Scanner;

public class Study10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수a:"); int a= stdIn.nextInt();
		System.out.println("정수b:"); int b= stdIn.nextInt();
		
		if(a<b) {
			int t=a; // a의값을  t에대입하여 저장한뒤
			a=b; // b의값을 a에대입
			b=t; //저장해둿던 t(a)를 b에 대입하여 종료
		}
		System.out.println("a>=b가되도록 정렿했습니다");
		System.out.println("변수a는"+a+"입니다");
		System.out.println("변수b는"+b+"입니다");
	}
}
