package P_0421;

import java.util.Random;
import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 Random ran=new Random();
	 
	int n;
	do {
		System.out.print("요소수:");
		n=sca.nextInt();
	 }while(n>10);
	//n의값이 10보다작을떄까지 다시 입력받아라
	int[] a=new int[n];
	
	for(int i=0;i<n;i++) {
		int j;
		
		do {
			j=0;
			a[i]=1+ran.nextInt(10);
			for(;j<i;j++) {
				if(a[j]==a[i]) {
					break;
				}
			}
		}while (j<i);
		//j가 i보다 작을경우는 하나 break가나서 j가 i만큼 커지지못했을경우 그럼 do문을 재실행
		//break가안나면 i의 값을 증감시킨후 반복
	}
	
	for(int i=0;i<n;i++) {
		System.out.println("a["+i+"]="+a[i]);
	}
	
	 }

}
