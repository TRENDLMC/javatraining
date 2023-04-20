package P_0420;

import java.util.Scanner;

public class Study11 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		//입력받은 n값으로 a배열의 배열수를 정해줌
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
			//a변수배열i에값에 입력값을 저장함
		}
		System.out.print("a={");
		if(n>=2) {
			//n의 값이 2랑크거나 같으면실행
			for(int i=0;i< n-1;i++) {
				//조건문실행 i가n-1보다 작을떄 실행 
				System.out.print(a[i]+",");
				//출력해라 a[i]의값을 
			}
		}if(n !=0 ) {
			//들어오는조건 n이 1보다 크거나같아야함 
			System.out.print(a[n-1]);
			//배열a[0]의 값을 마지막으로 출력해주어야하기떄문에 마지막에 n-1을해주어 0값을출력
		}
		System.out.print("}");
	}

}
