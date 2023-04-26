package P_0426;

import java.util.Scanner;

public class Study06 {
	static void aryRmw(int[] a,int idx) {
		if(idx>=0&&idx<a.length){
			//삭제할값이 0보다 크고 2a의배열수보다 크면 true
			
			for(int i=idx;i<a.length-1;i++) {
				//idx=2;일때
				a[i]=a[i+1];
				//a[2]=a[3]을저장한다이렇게 반복 그러므로 a[2]의값은 [3]이저장되고 하나씩내려감 
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.print("요소수:");
		int num=sca.nextInt();
		int[] a= new int[num];
		
		for(int i=0; i<num;i++) {
			System.out.print("a["+i+"]:");
			a[i]=sca.nextInt();
		}
		
		System.out.print("삭제할 요소의 인덱스:");
		int idx=sca.nextInt();
		
		aryRmw(a, idx);
		for(int i=0; i<num;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
