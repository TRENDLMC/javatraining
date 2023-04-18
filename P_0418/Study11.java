package P_0418;

import java.util.Scanner;

public class Study11 {
public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	System.out.println("정수를 더합니다.");
	System.out.print("몇개를 더할까요:");
	int n=stdIn.nextInt();
	int sum=0;
	int count=0;
	int i;
	for(i=0;i<n;i++) {
		System.out.print("정수:");
		int t=stdIn.nextInt();
		if(t<0) {
			//study 10과 동일하되
			//t의값이 0보다 작다면 음수라면 아래 문구를 출력하고 continue;해라 다시 for문을 반복해라라는명령어
			System.out.println("음수는 더하지않습니다");
			continue;
		}
		sum+=t;
		count++;
		//음수의 값이 들어갈경우 더하기는되지않지만 평균값은 내려가기떄문에 count라는 새로운 변수를선언해서 더하기된 값을 구한다 
	}
	System.out.println("합계는"+sum+"입니다.");
	if(i!=0) {
		System.out.println("평균은"+sum/count+"입니다");
	}
}
}
