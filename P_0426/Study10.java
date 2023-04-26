package P_0426;

import java.util.Scanner;

public class Study10 {
	static int[] arratClone(int[] a) {
		int[] c=new int [a.length];
		for(int i=0; i<c.length;i++) {
			c[i]=a[i];
			//복사해서 c[i]에저장함
		}return c;
		//그것을 리턴함 
	}
	
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("요소수:");
		int num=sca.nextInt();
		
		int[] x=new int[num];
		
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"]=");
			x[i]=sca.nextInt();
		}
		
		int [] y= arratClone(x);
		
		System.out.println("배열x를 복사해서 배열y를 생성했습니다.");
		for(int i=0; i<num;i++) {
			System.out.println("y["+i+"]="+y[i]);
		}
	}

}
