package P_0424;

import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
		Scanner sac=new Scanner(System.in);
		
		System.out.println("불규칙한 2차원 배열을 생성합니다");
		System.out.print("행수:");
		
		int height=sac.nextInt();
		
		int[][] c=new int[height][];
		//1차원 배열생성
		
		for(int i=0; i<c.length;i++) {
			System.out.print(i+"행쨰의 열수:");
			int width=sac.nextInt();
			c[i]=new int[width];
			//입력받은값을 2차원배열음만든다
		}
		
		System.out.println("각 요소의 값을 입력하세요");
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<c[i].length;j++) {
				System.out.printf("c[%d][%d]",i,j);
				c[i][j] =sac.nextInt();
				//2차원배열에 값을 입력받는다 값은 length로가므로 얼마가들어가든 상관없음 
			}
		}
		System.out.println("배열c의 각 요솟값은 다음과같습니다");
		//출력문
		for(int i=0; i<c.length;i++) {
			//1차원배열만큼 반복
			for(int j=0; j<c[i].length;j++) {
				//2차원배열만큼 반복 
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}
	}

}
