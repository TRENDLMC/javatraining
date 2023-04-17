package P_0417;

import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("1부터 n까지의 합을 구합니다");
		int n;
		do {
			System.out.print("n의 값");
			n=stdIn.nextInt();
		}while (n<=0);{}
		
		int sum =0;
		
		for(int i=1 ; i<n; i++) {
			
			System.out.print(i+"+");
			// i+ 출력 i는 1부터 1씩증감
			
			sum +=i;
			//sum = sum+i;
	
		}
		System.out.print(n+"=");
		//n+"=" 처음에 입력받은 n값 출력 위에for조건문에선 n은 더하지않기떄문에 마지막에더함
		sum+=n;
		// 반복한 값과 합산 하여대입
		
		System.out.println(sum);
	}

}
