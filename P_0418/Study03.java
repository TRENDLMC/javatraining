package P_0418;

import java.util.Scanner;

public class Study03 {
public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	int retry;
	System.out.println("계절을 찾습니다");
	do {
		int month;
		do {
			System.out.print("몇 월입니까?:");
			month=stdIn.nextInt();
		} while(month<1 || month>12);	
		//조건 month가 1보다 작거나 12보다 크면 true가 나와서 do문이 재실행
		if(month>=3 &&month<=5) {
			//month가 3보다 크거나같을떄 and month가 5보다작거나 같을떄 true
			System.out.println("봄입니다");
		}else if (month>=6 &&month<=8) {
			System.out.println("여름입니다");
		}else if (month>=9 &&month<=11) {
			System.out.println("가을입니다");
		}else if (month==12||month==1||month==2) {
			//month가 12 or 1 or 2 와 같으면 true 
			System.out.println("겨울입니다");
		}
		System.out.println("다시하겠습니까?1.yes 2.no");
		retry=stdIn.nextInt();
		
	}while(retry==1);
}
}
