package P_0413;

import java.util.Scanner;

public class Study11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수a:"); int a= stdIn.nextInt();
		System.out.println("정수b:"); int b= stdIn.nextInt();
		System.out.println("정수c:"); int c= stdIn.nextInt();
	
		if(a>b) {
			int t=a;
			a=b;
			b=t;
		}
		if(b>c) {
			int t=b;
			b=c;
			c=t;
		}
		if(a>b) {
			int t=a;
			a=b;
			b=t;
		}
		System.out.println("a<=b<=c 가되도록 정렬했습니다");
		System.out.println("변수a는"+a+"입니다");
		System.out.println("변수a는"+b+"입니다");
		System.out.println("변수a는"+c+"입니다");
	
	}
}
