package P_0418;

import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는:");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n; i++) {
			
			for(int j=1;j<=n-i;j++) {
				//n=5 i=1일떄 5-1번실행 4개의공백후 for2문으로넘어간다
				//n=5 i=4일떄 5-4번실행 1개의 공백후 for2문으로넘어감
				System.out.print(' ');
				//공백을출력한다
			}for(int j=1;j<=2*i-1;j++) {
				//j는 2*i-1과같을떄까지 실행
				//n=5 i=1 일떄 2*1-1번실행 값은 1번실행
				//n=5 i=4 일떄 2*4-1번실행 값은 7번실행 
				System.out.print('*');
				
			}
			System.out.println();
			//그후 개행을 넘김으로써 공백을 만드는것이아닌 개행을바꿔서 출력해라
		}
	}
}


