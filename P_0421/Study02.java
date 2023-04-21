package P_0421;

import java.util.Scanner;

public class Study02 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	
	System.out.print("요소수:");
	int n=sca.nextInt();
	int[] a=new int[n];
	
	for(int j=0;j<n;j++) {
		System.out.print("a["+j+"]:");
		//출력문
		a[j]=sca.nextInt();
		//a[]배을의 값을 입력해라 
	}
	System.out.println("찾을 숫자");
	int key=sca.nextInt();
	//찾을숫자를 key타입에 대입
	
	int i;
	//int i를 for밖에존재하게해서 for문이 끝나도 값이저장되게 함
	for(i=0;i<n;i++) {
		if(a[i]==key) {
			//a배열에 값을 대입해가면서 key와 같은 값을 찾음 찾으면 실행되서 break;
			break;
		}
	}if(i<n) {
		System.out.println("그값은a["+i+"]에있습니다");
	}else {
		System.out.println("해당값이 존재하지 않습니다");
	}
}
}
