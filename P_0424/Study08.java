package P_0424;

import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("학급수:");
		int classNum=sca.nextInt();
		int[][] point=new int[classNum][];
		//반 갯수만큼 1차원배열생성
		int totNumber=0;
		//
		
		for(int i=0; i<point.length;i++) {
			System.out.printf("\n%d반의 학생수:",i+1);
			int num= sca.nextInt();
			point[i]=new int[num];
			//포인트 i에다가 2차원배열을 만들어줌 2반도만들어줘야하기떄문에 각각 만들어준다
			totNumber+=num;
			//totnumber에 총학생수 저장 
			for(int j=0; j<point[i].length;j++){
				System.out.printf("%d반의%d번의점수",i+1,j+1);
				point[i][j]=sca.nextInt();
				//2차원배열에 학생별로 1개의 점수 입력  1차웝배열 학생 2차원배열 점수 
			}
		
		}
		//출력문
		System.out.println(" 반|  합계   평균");
		System.out.println("--+---------------------");
		int total=0;
		for(int i=0; i<point.length;i++) {
			int sum=0;
			for(int j=0; j<point[i].length;j++){
				sum += point[i][j];
			}total += sum;
			System.out.printf("%2d반|%7d%7.1f\n",i+1,sum,(double)sum/point[i].length);
		}
		System.out.println("--+--------------------");
		System.out.printf("합:%7d%7.1f\n",total,(double)total/totNumber);
	}

}
