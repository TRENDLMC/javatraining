package P_0421;

import java.util.Random;
import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
		Random ran=new Random();
		Scanner sca=new Scanner(System.in);
		String[] monthString= {
				"Januart","February","March","April","May","June","July",
				"August","September","October","November","December"
				};
		
		System.out.println("해당 월의 영어 단어를 입력하십시오");
		System.out.println("첫문자는 대문자, 나머지는 소문자로 입력하세요.");
		int retry;
		int last=-1;
		do {
			int month;
			do {
				month=ran.nextInt(12);
			}while(month==last);
			
			last=month;
			
			while(true) {
				System.out.print((month+1)+"월:");
				String s=sca.next();
				if(s.equals(monthString[month])) {
					break;
				}else {
					System.out.println("틀렷습니다");
				}
			}
			System.out.println("정답입니다 다시한번?1...yes/2....no");
			retry=sca.nextInt();
		}while(retry==1);
	}
}

