package P_0413;

import java.util.Random;

public class Study12 {
	public static void main(String[] args) {
		Random rand=new Random();
		
		System.out.println("컴퓨터가 낸것:");
		int hand =rand.nextInt(3);
		//랜덤변수 3개중하나가 나오게 만들어주는 소스코드
		
		switch(hand) {
		case 0:
			System.out.println("가위"); 
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;	
		}
		
		
	}

}
