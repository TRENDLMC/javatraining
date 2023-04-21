package P_0421;

import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("사람수:");
		int n=sca.nextInt();
		int[] points=new int[n];
		// int 타입의 변수포인트선언 배열갯수는 입력값
		System.out.println("점수를입력하세요.");
		int sum=0;
		
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+"번의점수");
			points[i]=sca.nextInt();
			sum +=points[i];
			//int 타입의변수 sum에 학생들의점수합을 대입
		}
		
		int max=points[0];
		int min=points[0];
		//pointes 변수의 배열 0번을 max와mix에대입
		for(int i=1;i<n;i++) {
			if(points[i]>max) {
				//모든학생의 점수를 대입해보고 그전대열보다 크다면 그값을 다시대입해라
				max=points[i];
			}if(points[i]<min) {
				//모든학생의 점수를 대입해보고 그전대열보다 작다면 그값을 다시대입해라
				min=points[i];
			}
		}
		System.out.println("합계는"+sum+"점입니다");
		System.out.println("평균은"+(double)sum/n+"점입니다");
		//double 타입으로 강제타입변환시켜서 나눗셈의값을 표시해라 
		System.out.println("최고점은"+max+"점입니다");
		System.out.println("최저점은"+min+"점입니다");
	}

}
