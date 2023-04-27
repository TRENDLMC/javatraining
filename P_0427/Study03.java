package P_0427;

import java.util.Scanner;

public class Study03 {
	
	static int[] arrayRmvOfN(int[] a,int idx,int n) {
		if(n<0||idx<0||idx>a.length) {
			//n이0보다작거나 idx가0보다작거나 idx가 a배열의길이보다 크면 그냥리턴
			return a.clone();
		}else {
			if(idx+n>a.length) {
				//idx+n의값이 a.length값보다크면 지울개수를 
				n=a.length-idx;
			}
			int[] c=new int[a.length-n];
			int i=0;
			for(;i<idx;i++) {
				c[i]=a[i];
			}for(;i<a.length-n;i++) {
				c[i]=a[i+n];
			}return c;
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
		
		System.out.print("삭제를 시작할 인덱스");
		int idx=sca.nextInt();
		System.out.print("삭제할 요소의개수:");
		int n=sca.nextInt();
		
		int[] y=arrayRmvOfN(x, idx,n);
		
		for(int i=0;i<y.length;i++) {
			System.out.println("y["+i+"]="+y[i]);
		}
		
	}

}
