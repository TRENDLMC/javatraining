package P_0425;

import java.util.Random;
import java.util.Scanner;

public class Study06 {
	static int random(int a,int b) {
		if(b<=a) {
			System.out.println("상한값이 하한값보다 작습니다 오류");
			return 0;
			//하한값이 상한값보다 크므로 입력오류 그러므로 그냥리턴
		}else {
			Random rand=new Random();
			return a+rand.nextInt(b-a)+1;
			//랜덤값을 입력받는다 a+랜덤(상한값-하한값+1(+1은 0을없애주는역활)
			//즉 최솟값이 하한값 a보다 크게나오고 상한값보단 낮게나온다
		}
	}

	
	public static void main(String[] args) {
		
	Scanner sca=new Scanner(System.in);
	System.out.println("난수를 생성합니다");
	System.out.print("하한값:"); int min=sca.nextInt();
	System.out.print("상한값:"); int max=sca.nextInt();
	
	System.out.println("생성된난수는"+ random(min,max)+"입니다");
	}
}
