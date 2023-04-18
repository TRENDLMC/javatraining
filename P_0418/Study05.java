package P_0418;

import java.util.Scanner;

public class Study05 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는:");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n; i++) {
			//i가 n과같아질떄까지반복
			for(int j=1;j<=i;j++) {
				//j가 i랑 같아질때까지 반복해라
				System.out.print('*');
				//즉i가 1이대입되면 1번실행후 종료 2번대입되면 2번실행후종류한다 
			}
			System.out.println();
		}
	}
}


