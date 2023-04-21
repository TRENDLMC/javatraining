package P_0421;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 System.out.print("요소수:");
	 
	 int n=sca.nextInt();
	 double[] a=new double[n];
	 
	 for(int i=0;i<n;i++) {
		 System.out.print("a["+i+"]=");
		 a[i]=sca.nextDouble();
	 }
	 double sum=0;
	 for(double i: a ) {
		 //향샹된 for문 for문을 a배열의 length만큼실행 
		 sum+=i;
	 }
	 
	 System.out.println("모든 요소의 합은"+sum+"입니다");
	 System.out.println("모든 요소의 평균은"+sum/n+"입니다");
	 }

}
