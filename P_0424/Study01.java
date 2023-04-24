package P_0424;

import java.util.Random;
import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		Random ran=new Random();
		Scanner sca=new Scanner(System.in);
		String[] dayKorea= {"일","월","화","수","목","금","토"};
		String[] dayEnglish= {"sunday","monday","tuesday","wednesday","thursday"
				,"friday","saturday"};
		
		System.out.println("요일명을 영어 소문자로 입력하시오");
		int retry;
		int last=-1;
		do {
			int day;
			do {
				day=ran.nextInt(7);
			}while(day==last);
			// -1의값은나오지않으므로 한번만 실행하기위해서 last를설정해둠
			
			last=day;
			//그후 day와 같게바꾸어줌 재실행되면 같은문제가 나오지않게함 
			
			while(true) {
				//항상실행
				System.out.print((dayKorea[day])+"요일:");
				String s=sca.next();
				//변수s에 값을 일력받음
				if(s.equals(dayEnglish[day])) {
					//문자열을 비교서 맞으면 break함
					break;
				}else {
					System.out.println("틀렷습니다");
				}
			}
			System.out.println("정답입니다 다시한번?1...yes/2....no");
			retry=sca.nextInt();
			//retry의 값을 입력받아  do while문실행 여부결정
		}while(retry==1);
	}
}

