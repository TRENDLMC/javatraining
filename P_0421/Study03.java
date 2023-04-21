package P_0421;

import java.util.Scanner;

public class Study03 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	
	System.out.print("요소수:");
	int n=sca.nextInt();
	int[] a=new int[n];
	
	for(int j=0;j<n;j++) {
		System.out.print("a["+j+"]:");
		a[j]=sca.nextInt();
	}
	
	System.out.println("찾을 숫자");
	int key=sca.nextInt();
	
	int i;
	for(i=n-1;i>=0;i--) {
		//위에서 아래로 내려가면서 찾음 
		if(a[i]==key) {
			break;
		}
	}if(i<n) {
		System.out.println("그값은a["+i+"]에있습니다");
	}else {
		System.out.println("해당값이 존재하지 않습니다");
	}
}
}
