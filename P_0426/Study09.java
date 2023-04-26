package P_0426;

import java.util.Scanner;

public class Study09 {
	static void aryExchng(int[] a,int[] b) {
		int n=a.length<b.length?a.length:b.length;
		for(int i=0; i<n;i++) {
			int t=a[i];
			a[i]=b[i];
			b[i]=t;
			//교환식 t=a[i]를저장하고 a[i]에 b[i]를저장하고 b[i]에 t(a[i])값을 저장하는
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		
		System.out.print("배열 a의 요소수");
		int na=sca.nextInt();
		int[] a=new int[na];
		
		for(int i=0;i<na;i++) {
			System.out.print("a["+"]:");
			a[i]=sca.nextInt();
		}
		
		System.out.print("배열 b의 요소수");
		int nb=sca.nextInt();
		int[] b=new int[nb];
		
		for(int i=0;i<nb;i++) {
			System.out.print("a["+"]:");
			b[i]=sca.nextInt();
		}
		
		aryExchng(a, b);
		System.out.println("배열 a와 b의 전체 요소를 교환했습니다");
		
		for(int i=0; i<na;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		for(int i=0; i<nb;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
	}

}
