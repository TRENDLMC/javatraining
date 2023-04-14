package P_0414;

import java.util.Random;
import java.util.Scanner;

public class Study03 {
	public static void main(String[] args) {
		Random rand= new Random();
		Scanner stdInd=new Scanner(System.in);
		
		int no= 10+rand.nextInt(90);
		System.out.println(no);
		System.out.println("숫자 맞추기 게임 시작");
		System.out.println("10부터 99사이의 숫자를 맞추세요");
		int x;
		do {
			System.out.println("어떤숫자일까");
			x=stdInd.nextInt();
		
			if(x>no) {
				System.out.println("더 작은 숫자입니다");
			}else if(no>x) {
				System.out.println("더 큰숫자입니다");
			}
		}while(x!=no);{
			System.out.println("정답입니다");
		}
	}

}
