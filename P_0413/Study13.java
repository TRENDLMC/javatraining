package P_0413;

import java.util.Scanner;

public class Study13 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("몇 월입니까");
		int month=stdIn.nextInt();
		
		switch(month) { //스위치 문 사용
		case 3:
		case 4:
		case 5:System.out.println("봄입니다");
		break;
		case 6:
		case 7:
		case 8:System.out.println("여름입니다");
		break;
		case 9:
		case 10:
		case 11:System.out.println("가을입니다");
		break;
		case 12:
		case 1:
		case 2:System.out.println("봄입니다");
		break;
		default:System.out.println("존재하지 않는 월입니다");
		break;
		}
		
	}
}
