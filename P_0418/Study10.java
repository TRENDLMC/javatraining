package P_0418;

import java.util.Scanner;

public class Study10 {
public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	System.out.println("정수를 더합니다.");
	System.out.print("몇개를 더할까요:");
	int n=stdIn.nextInt();
	//반복할 n의 값을 받는다
	int sum=0;
	int i;
	for(i=0;i<n;i++) {
		//0부터 증감되에따라 i가 n 이랑 같아지면 종료된다
		System.out.print("정수(0으로 종료):");
		int t=stdIn.nextInt();
		//int타입의 변수를 입력받는다
		if(t==0) {
			//그값이 0이라면 for문을 종료
			break;
		}else{
			sum+=t;
		}
		//0이 아니라면 sum 변수에다가 sum+t의값을 더해라 
	}
	System.out.println("합계는"+sum+"입니다.");
	if(i!=0) {
		System.out.println("평균은"+sum/i+"입니다");
	}
}
}
