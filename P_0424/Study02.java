package P_0424;

import java.util.Random;
import java.util.Scanner;

public class Study02 {

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
			
			last=day;
			int action;
			do {
				System.out.print((dayKorea[day])+"요일:");
				String s=sca.next();
				if(s.equals(dayEnglish[day])) {
				System.out.println("정답입니다");
				break;
				}
			System.out.println("틀렷습니다");
			
				do {
					System.out.print("어떻게할까요? 1..재입력/0..정답보기");
					//다중 제어문 do문을하나더넣어서 위에서break가되지않으면 무조건 실행되게 만듬 break가되는경우는 맞췃을경우 do문을넘기고 
					//세번쨰 do문의끝인 action으로가는데 값이 없으므로 재실행되지않고 바로 그대로 retry문으로넘어감
					action=sca.nextInt();
					//여기서 입력시 while발동조건 0이아니거나 or 1이아니면 다시실행하라 
				}while(action !=0 && action !=1);
				//그후넘어와서 if문으로 비교 
				if(action==0) {
					System.out.println(dayKorea[day]+"요일은\""+dayEnglish[day]+"\"입니다");
					//정답출력후 밑에 while문실행하지않고 넘어감 
				}
			}while(action==1);
			System.out.println("정답입니다 다시한번?1...yes/2....no");
			retry=sca.nextInt();
		}while(retry==1);
	}
}

