package P_0426;

import java.util.Scanner;

public class Study08 {
	static void aryIns(int[] a,int idx,int x) {
		if(idx>=0 &&idx<a.length) {
			for(int i=a.length-1;i>idx;i--) {
				a[i]=a[i-1];
				//일단 최대값부터 내가바꾸고 싶은값까지의값을 한단계씩내려서 저장한후
			}a[idx]=x;
			//마지막에내가 넣고싶은인덱스에 값을 대입한다 
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
		
		System.out.print("삽입할 요소의 인덱스:");
		int idx=sca.nextInt();
		System.out.print("삽입할 값");
		int n=sca.nextInt();
		
		aryIns(a, idx,n);
		
		for(int i=0; i<num;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
