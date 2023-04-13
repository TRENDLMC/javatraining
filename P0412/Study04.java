package P0412;

import java.util.Scanner;

public class Study04 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("변수a:"); int a = stdIn.nextInt();
		System.out.print("변수b:"); int b = stdIn.nextInt();
		
		if(!(a%b == 0)) {
			// a%b == a가 b로 나눴을때 남는값이 0인가
			System.out.println("B는 A의 약수가 아닙니다");
		}else {
			System.out.println("B는 A의 약수 입니다.");
		}
	}

}
