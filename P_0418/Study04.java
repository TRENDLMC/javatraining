package P_0418;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("정방형을 표시합니다.");
		System.out.print("단수는:");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n; i++) {
			//i가 n이랑같이질떄까지 반복
			for(int j=1;j<=n;j++) {
				//j가 n과같아질떄까지반복하는데 프린트해라*을 행을바꾸지않고
				System.out.print('*');
				//n과 같아지면종료후 위에for문으로가서 재실행 
			}
			System.out.println();
		}
	}
}


