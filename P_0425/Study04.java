package P_0425;

import java.util.Scanner;

public class Study04 {
	static String seasonOf(int m) {
		switch(m) {
		
		case 3:
		case 4:
		case 5:
			return "봄";
		case 6:
		case 7:
		case 8:
			return "여름";
		case 9:
		case 10:
		case 11:
			return "여름";
		case 12:
		case 1:
		case 2:
			return "여름";
		}
		return "";
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		int month;
		do {
			System.out.print("몇월입니까(1~12):");
			month =sca.nextInt();
		}while(month<1||month>12);
	System.out.println("해당"+month+" 월의 계절은"+seasonOf(month)+"입니다");
	//위에 메소드에서 문자열을 리턴시킨다
	
	}
	
}
