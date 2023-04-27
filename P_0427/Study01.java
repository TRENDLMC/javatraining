package P_0427;

import java.util.Scanner;

public class Study01 {
	
	static int[] arrySrchIdx(int[] a,int x) {
		int count =0;
		for(int i=0; i<a.length; i++) {
			//최대횟수는 a배열의길이수만큼
			if(a[i]==x) {
				count++;
				//x와 일치하는 요소의 갯수를 체크함
			}
		}
		int[] c=new int[count--];
		//배열c에 count값을 저장후count의값을 1감소시킴 갯수만큼실행하기위해
		for(int i=a.length-1;count>=0;i--) {
			//
			if(a[i]==x) {
				//원하는값을 찾았다면
				c[count--]=i;
				//c[count]에 인덱스의값을저장후 다음 인덱스를준비하고 반복 해서 count의갯수가 0이되면중지 
			}
		}return c;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("요소수:");
		int num=sca.nextInt();
		
		int[] x= new int[num];
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i]=sca.nextInt();
		}
		System.out.print("탐색할값:");
		int n=sca.nextInt();
		
		int[] b=arrySrchIdx(x, n);
		
		if(b.length==0) {
			System.out.println("일치하는 요소가 없습니다");
		}else {
			System.out.println("일차하는 요소의 인덱스");
			for(int i=0; i<b.length;i++) {
				System.out.println(b[i]);
			}
		}
		
		
		
		
	}

}
