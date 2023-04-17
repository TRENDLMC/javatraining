package P_0417;

import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("몇개의 *를표시할까요?:");
		int n=stdIn.nextInt();
		if(n>0) {
			for(int i=0; i<n; i++) {
				System.out.print('*');
				// 개행띄우기실행하지않고 *을 출력 
				if(i%5==4) {
					//i나누기 5가 4일떄 개행비움을 실행 0부터실행이기에 남는값이 4면 5번실행기기떄문에
					//한줄띄워라 5개를 표시하고
					System.out.println();
				}
			}
			if(n%5!=0) {
				//n나누기5가 0이아닐때 개행비움실행
				
				System.out.println();
			}
		}
	}

}
