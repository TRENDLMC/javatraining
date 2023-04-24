package P_0424;

import java.util.Scanner;

public class Study05 {
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int[][] a=new int[4][3];
		int[][] b=new int[3][4];
		int[][] c=new int[4][4];
		
		System.out.println("행렬 a의요소를 입력하세요");
		
		for(int i=0; i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf("a[%d][%d]",i,j);
				//출력문
				a[i][j]=sca.nextInt();
				// a[0][0]부터 a[3][2]까지입력해라 
			}
		}
		
		System.out.println("행렬 b의 요소를 입력하세요");	
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("b[%d][%d]",i,j);
				b[i][j]=sca.nextInt();
				// b[0][0]부터 b[3][2]까지입력해라 
			}
		}
		
		for(int i=0; i<4 ;i++){
			for(int j=0; j<4; j++){
				c[i][j]=0;
				for(int k=0; k<3;k++){
					c[i][j] += a[i][k]*b[k][j];
					//c[0][0]는 c[3][3]까지 값을받고 a는[4][3] b는[3][4]까지의 값을 대입해서 둘이 곱하여 저장해라 
					}
				}
			}
		System.out.println("행렬  a와b의곱");
		for(int i=0; i<4;i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%5d",c[i][j]);
				//출력문 
			}
			System.out.println();
		}
	}
}


