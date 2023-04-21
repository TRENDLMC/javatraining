package P_0421;

import java.util.Random;
import java.util.Scanner;

public class Study09 {
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 Random ran=new Random();
	 
	 System.out.print("요소수:");
	 int n=sca.nextInt();
	 int[] a=new int[n];
	 int[] b=new int[n];
	 
	 for(int i=0;i<n;i++) {
		 System.out.print("a["+i+"]=");
		 a[i]=sca.nextInt();
	 }
	 
	 for(int i=0;i<n;i++) {
		 b[i]=a[n-i-1];
	}
	 
	 System.out.println("a의모든요소를 역순으로 복사했습니다");
	for(int i=0; i<n;i++) {
		 System.out.println
		 ("b["+i+"]="+b[i]);
	}
	}
}

