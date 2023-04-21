package P_0421;

import java.util.Random;
import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 Random ran=new Random();
	 
	 System.out.print("요소수:");
	 int n=sca.nextInt();
	 int[] a=new int[n];
	 
	 for(int i=0;i<n;i++) {
		 System.out.print("a["+i+"]=");
		 a[i]=sca.nextInt();
	 }
	 
	 for(int i=0;i<2*n;i++) {
		 int idx1=ran.nextInt(n);
		 int idx2=ran.nextInt(n);
		 int t=a[idx1];
		 a[idx1]=a[idx2];
		 a[idx2]=t;
	 }
	 //한번이라도 다른값이 나오면 바뀐다
	 System.out.println("요소를 섞었습니다");
	 for(int i=0;i<n;i++) {
		System.out.println("a["+i+"]="+a[i]);
	}
	}
	
}

