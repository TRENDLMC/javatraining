package P_0417;

import java.util.Scanner;

public class Study02 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("몇개의 *를표시할까요?:");
		int n=stdIn.nextInt();
		if(n>0) {
			//n이 0보다 크다면 실행
			for(int i=0; i<n; i++) {
				//조건값 i선언후 i가 n보다 작을떄까지 실행및 1씩증감
				System.out.print('*');
				//실행될떄마다 *출력 
				System.out.println();
				//하고 한칸 행을 넘긴다 
			}
		}
	}

}
