package P_0418;

import java.util.Scanner;

public class Study12 {
public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	System.out.println("정수를 더합니다.");
	System.out.print("몇개를 더할까요:");
	int n=stdIn.nextInt();
	int sum=0;
	int i;
	for(i=0;i<n;i++) {
		System.out.print("정수:");
		int t=stdIn.nextInt();
		if(sum+t>1000) {
			//sum+t의 값이 1000이넘을때 그냥 브레이크해버린다..
			System.out.println("합계가 1000이넘었습니다");
			System.out.println("마지막값은 무시합니다");
			break;
		}
		sum+=t;
	}
	System.out.println("합계는"+sum+"입니다.");
	if(i!=0) {
		System.out.println("평균은"+sum/i+"입니다");
		//int i를 for반복문 밖에 선언해주어서 i의값을 저장한후 sum을 나눈다 
	}
}
}
