package P_0421;

import java.util.Random;
import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 Random ran=new Random();
	 System.out.print("요소수:");
	 int n=sca.nextInt();
   	 int[] a=new int[n];
   	 a[0]=1+ran.nextInt(10);
   	 
	
	for(int i=1;i<n;i++) {
		do{
			a[i]=1+ran.nextInt(10);
		}while(a[i]==a[i-1]);
		//전껏과똑같은데 a[i]가 증감되기전의 값과같다면 다를떄까지반복해라 
	}
	for(int i=0;i<n;i++) {
		System.out.println("a["+i+"]="+a[i]);
	}
	
	 }

}
