package P_0417;

import java.util.Scanner;

public class Study09 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("몇개의 *를표시할까요?:");
		int n=stdIn.nextInt();
		if(n>0) {
			for(int i=0; i<n/5; i++) {
				System.out.println("*****");
				// i가 n나누기5 보다작게 반복해라 i는 증감 
			}	
			int rest= n%5 ;
			// n%5의 남는값을 저장
			if(rest>0) {
				//그남는값이 0보다 클떄 실행
					for(int i=0; i<rest; i++) {
						//rest가 1이라면  i가 1보다 작으니깐 한번실행후 종류
						System.out.print("*");}
						//띄지않고 *표시후
					System.out.println();
					// 마지막에 한칸띄움
			}
		}
	}
}

