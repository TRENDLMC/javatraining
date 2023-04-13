package P_0413;

import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수a:"); int a= stdIn.nextInt();
		System.out.println("정수b:"); int b= stdIn.nextInt();
		System.out.println("정수c:"); int c= stdIn.nextInt();
	
		int min = a;
		if(b < min) { min = b;} 
		// min 에 a값을 대입하여 b가 작다면 최솟값을 구하기위해 b를 대입해라 라는 명령어 b가클경우 false 값이므로 실행되지않는다
		if(c < min) { min = c;}
		System.out.println("최솟값은"+min+"입니다");
	}

}
