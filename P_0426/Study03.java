package P_0426;

import java.util.Scanner;

public class Study03 {
	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum +=a[i];
		}return sum;
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("요소수:");
		int num=sca.nextInt();
		int[] x=new int[num];
		
		for(int i=0;i<num;i++) {
			//요소의 수많큼 값을 입력받는 반복문
			System.out.print("x["+i+"}:");
			x[i]=sca.nextInt();
		}
		
		System.out.println("모든 요소의 합은 "+sumOf(x)+"입니다");
	}

}

/* 
 static int sumOf(int []a){
 int sum=0;
 for(int i:a){
 sum+=i;
 }
 return sum; */
 
