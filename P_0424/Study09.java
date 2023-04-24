package P_0424;

import java.util.Scanner;

public class Study09 {
	static int signOf(int n) {
		int sign=0;
		//정수인지 실수인지 아는 메소드
		
		if(n>0) {
			//n이0보다 크면 1을 출력
			sign=1;
		}else if(n<0) {
			//n이 0보다 작으면 -1을 출력 
			sign=-1;
		}
		return sign;
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("정수x:");
		int x=sca.nextInt();
		
		int s=signOf(x);
		System.out.println("singOf(x)는"+s+"입니다");
		
	}

}
