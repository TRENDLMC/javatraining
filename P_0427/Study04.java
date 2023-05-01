package P_0427;

import java.util.Scanner;

public class Study04 {
	
	static int[] arrayInsOf(int[] a,int idx,int n) {
		if(idx<0||idx>a.length) {
			return a.clone();
		}else {
			int[] c=new int[a.length+1];
			int i=0;
			for(;i<idx;i++) {
				c[i]=a[i];
			}for(;i<a.length;i++) {
				c[i+1]=a[i];
			}c[idx]=n;
			return c;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		
		System.out.print("요소수:");
		int num=sca.nextInt();
		int[] x=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i]=sca.nextInt();
		}
		
		System.out.print("삽입할 인덱스");
		int idx=sca.nextInt();
		System.out.print("삽입할 값:");
		int n=sca.nextInt();
		
		int[] y=arrayInsOf(x, idx,n);
		
		for(int i=0;i<y.length;i++) {
			System.out.println("y["+i+"]="+y[i]);
		}
		
	}

}