package P_0418;

import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는:");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n; i++) {
			
			for(int j=1;j<=n-i+1;j++) {
				//Study5와 동일하지만 j가 n이랑같을떄까지실행하는데! n-i+1이다
				//즉 n=5 i=1이면  5-1+1 이라서 5번실행
				//i가 5라면 5-5+1이라 1번실행 역으로표시된다
				System.out.print('*');
			}
			System.out.println();
		}
	}
}


