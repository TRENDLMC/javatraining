package P_0424;

import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		final int number=6;
		//학생을 6명으로 고정 final를 써서 변경불가능하게 바꿈 입력값으로바꿔도 문제없음 아래
		int [][] point=new int[number][2];
		//과목이 두개기떄문에 학생수당 2개의 배열을만들어줌
		int[] sumStudent=new int[number];
		// 학생의 의 두과목의합을 저장하기위해 만들어줌
		int[] sumSubject=new int[2];
		//두과목의 총합을 저장하기위해 만듬
		
		System.out.printf("%d명의 국어,수함점수를 입력하세요.\n",number);
		//출력문 number=6
		
		for(int i=0; i<number;i++) {
			System.out.printf("%2d번국어:",i+1);
			//배열은 i는 0부터시작하기떄문에 +1을해줌
			point[i][0]=sca.nextInt();
			System.out.print("     수학");
			point[i][1]=sca.nextInt();
			
			sumStudent[i]=point[i][0]+point[i][1];
			//학생의 점수를 두과목을 저장함
			sumSubject[0] += point[i][0];
			//sum[0]는 국어의 합을
			sumSubject[1] += point[i][1];
			//sum[1]는 수학의값을저장
		}
		System.out.println("no    국어   수학 평균");
		for(int i=0; i<number ;i++) {
			//출력문
			System.out.printf("%2d%6d%6d%6.1f\n",i+1,point[i][0],point[i][1],
					(double)sumStudent[i]/2);
		}
		System.out.printf("평균%6.1f%6.1f\n",(double)sumSubject[0]/number,(double)sumSubject[1]/number);
		
	}

}
