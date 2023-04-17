package P_0417;

import java.util.Scanner;

public class Study10 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("정수값:");
		int n=stdIn.nextInt();
		int count =0;
		for(int i=1; i<=n;i++) 
			if(n%i ==0) {
				System.out.print(i+" ");
				// n이 i로 나눠지고 남는값이 0이면 ture n의 약수구하는것
				count++;
			}
	System.out.println("\n의약수는"+count+"개입니다");
		
	}
}
		
