package P_0427;

import java.util.Scanner;

public class Study02 {
	
	static int[] arrayRmvOf(int[] a,int idx) {
		if(idx<0 && idx>=a.length-1) {
			return a.clone(); //a.clone<<a의 복사본을 만드는것 
		}else {
			int[] c= new int[a.length-1];
			int i=0;
			for(;i<idx;i++) {
				c[i]=a[i];
				//삭제할 인덱스보다 낮은값들을 c에저장함
			}
			for(;i<a.length-1;i++) {
				// i의값은 이미 위에서 삭제하기전까지 저장했기때문에 이번for문에서는i의값은 삭제할값부터시작함 
				c[i]=a[i+1];
			}
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
		
		System.out.print("삭제할인덱스");
		int idx=sca.nextInt();
		
		int[] y=arrayRmvOf(x, idx);
		
		for(int i=0;i<y.length;i++) {
			System.out.println("y["+i+"]="+y[i]);
		}
		
	}

}
