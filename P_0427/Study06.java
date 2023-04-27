package P_0427;

import java.util.Scanner;

public class Study06 {
	static int[][] aryClone2(int[][] a){
		int[][] c=new int[a.length][];
		for(int i=0;i<a.length;i++) {
			c[i]= new int[a[i].length];
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j];
			}

		}return c;
	}
	
	static void printMatrix(int[][] m) {
		for(int i=0; i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("행렬의 행수:"); int height=sca.nextInt();
		System.out.print("행렬의 열수:"); int widht=sca.nextInt();
		
		int[][] a=new int[height][widht];
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("a[%d][%d]:",i,j);
				a[i][j]=sca.nextInt();
			}
		}
		
		int [][] ca=aryClone2(a);
		System.out.println("행렬a");
		printMatrix(a);
		
		System.out.println("행렬a의복사본");
		printMatrix(ca);
		
	}
}
