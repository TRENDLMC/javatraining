package P_0413;

import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수a:"); int a= stdIn.nextInt();
		System.out.print("정수b:"); int b= stdIn.nextInt();
		System.out.print("정수c:"); int c= stdIn.nextInt();
	
		int med; // int타입의 변수 med를 선언
		if(a>=b) //a가 b보다 크거나 같을경우 아래의 if를 실행하라
			if(b>=c) { med=b;}//b가 c보다 크거나 같을경우 med에 b에 대입해라
			else if (a<=c) {med=a;}//a가c보다 작거나 같은경우 med에 a를 대입하라 
			else {med=c;}// 위에 두경우가 아닐경우 med에 c를 대입하라 
		// 
		else if (a>c){ med=a;}
		else if (b>c){ med=c;}
		else {med=b;}
		
		System.out.println("중앙값은"+med+"입니다");
	
	}

}
