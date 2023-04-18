package P_0418;

import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시합니다.");
		System.out.print("단수는:");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n; i++) {
			
			for(int j=1;j<=n-i;j++) {
				
			System.out.print(' ');
			
			}for(int j=1;j<=2*i-1;j++) {
			//study07과 똑같음 다른것은 *대신 숫자로표현한것
			System.out.print(i%10);
			//i가 1일때 1/10= 1을 10으로나눌수없기떄문에 나누기공식을 실행하지않고 그냥 나머지값으로 1을던진다 
			//i가 2일떄 2/10
			
			}
			
			System.out.println();
		}
	}
}


