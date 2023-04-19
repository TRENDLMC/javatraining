package P_0419;

import java.util.Scanner;

public class Study01 {
public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	System.out.println("정수를 더합니다");
	int total=0;
	
	Outer:
		for(int i=1;i<=10;i++) {
			System.out.println(i+"그룹");
		
	for(int j=0;j<5;j++) {
		System.out.println("정수:");
		int t=stdIn.nextInt();
		if(t==99999) {
			//입력값이 99999면 outer항목을 종료해라
			break Outer;
		}else if(t ==88888) {
			continue Outer;
			//입력값이 88888이면 for문을 종료하고 outer로돌아가라 
			//컨티뉴와 브레이크의차이
		}else{
			total +=t;
		}
	}
	
		}
	System.out.println("\n합계는"+total+"입니다.");
	
	}
}
