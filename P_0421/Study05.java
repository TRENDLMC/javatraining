package P_0421;

import java.util.Random;
import java.util.Scanner;

public class Study05 {
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 Random ran=new Random();
	 System.out.print("요소수:");
	int n=sca.nextInt();
	int[] a=new int[n];
	//int타입의 변수a에 n번만큼의배열을생성
	
	for(int i=0;i<n;i++) {
		a[i]=1+ran.nextInt(10);
		//a[i]==a[n]에 랜덤으로 0~9까지의변수를넣고 +1을 해줌
	}
	for(int i=0;i<n;i++) {
		System.out.println("a["+i+"]="+a[i]);
	}
	
	 }

}
