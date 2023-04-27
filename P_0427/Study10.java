package P_0427;

import java.util.Scanner;

public class Study10 {
	static void printArray(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}System.out.println(a[a.length-1]);
		System.out.println();
	}
	
	static void printArray(int[][] a) {
		int[][] width=new int[a.length][];
		int max=0;
		for(int i=0;i<a.length;i++) {
			width[i]=new int[a[i].length];
			if(a[i].length>max) {
				max=a[i].length;
			}
		}
		int[] maxwidth=new int[max];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				int value=a[i][j];
				width[i][j]=(value<0)? 1 : 0;		
				do{
					width[i][j]++;
					value/=10;
				}while(value!=0);
				if(width[i][j]>maxwidth[j]) {
					maxwidth[j]=width[i][j];
				}
			}
		}for(int i =0;i<a.length;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				System.out.print(a[i][j]);
				for(int k=0; k<=maxwidth[j]-width[i][j];k++) {
					System.out.print(' ');
				}
			}
			System.out.println(a[i][a[i].length-1]);
		}
	}
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("1차원 행렬 x의 요소수:");
		int num=sca.nextInt();
		int[] x= new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i]=sca.nextInt();
		}
		
		System.out.print("2차원 배열 y의 행수:");
		int height=sca.nextInt();
		int[][] y =new int[height][];
		for(int i=0; i<y.length ; i++) {
			System.out.print(i+"행쨰열수:");
			int width=sca.nextInt();
			y[i]=new int[width];
		}
		
		System.out.println("각요소의 값을입력하자");
		for(int i=0; i<y.length;i++) {
			for(int j=0;j<y[i].length;j++) {
				System.out.printf("y[%d][%d]",i,j);
				y[i][j]=sca.nextInt();
			}
		}
		
		System.out.println("\n1차원 배열x");
		printArray(x);
		System.out.println("\n2차원 배열 y");
		printArray(y);
		
	}
}
