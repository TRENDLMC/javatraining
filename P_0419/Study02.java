package P_0419;

import java.util.Random;
import java.util.Scanner;

public class Study02 {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner strIn=new Scanner(System.in);
		
		final int MAX_NO=6;
		int leftNo=MAX_NO;
		//기회 leftno 에 최대목숨값을 대입한다 
		int no=rand.nextInt(100);
		//0~99의 랜덤값을 대입하는 함수
		
		System.out.println("숫자 맟추기 게임시작");
		System.out.println("0부터99사이의 숫자를 맞추세요");
		
		int x;
		do {
			System.out.print("남은횟수"+(leftNo--)+"회 어떤숫자일까:");
			x=strIn.nextInt();
			
			if(x>no) {
				System.out.println("더작은 숫자입니다");
			}else if(x<no) {
				System.out.println("더큰숫자입니다");
			}
		}while(x !=no && leftNo !=0);
		//do while문 x가 틀리거나ㅣ left가 0이아니면 다시실행해라 
		
		if(x==no) {
			//x가 no과같으면실행
			System.out.println((MAX_NO-leftNo)+"회만에 맞추었습니다.");
		}else
			System.out.println("아쉽네요 정답은:"+no+"입니다");
	}

}
