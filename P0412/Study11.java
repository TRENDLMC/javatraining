package P0412;

import java.util.Scanner;

public class Study11 {
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.print("점수");
		int point = stdIn.nextInt();
		
		if(point >= 0 && point <= 49) {
			// &&
			System.out.println("가");
		}else if(point >= 50 && point <= 59) {
			//점수가 50점보다낮거나 같을떄 && 59점이랑같거나낮을떄
			// &&명령어 true 와 flase 을 구분해줌 하나라도 false 이나오면 그것의 갑은 false가나오므로 if명령어가 실행되지않는다
			System.out.println("양");
		}else if(point >= 60 && point <= 69) {
			System.out.println("미");
		}else if(point >= 70 && point <= 79) {
			System.out.println("우");
		}else if(point >= 80 && point <= 100) {
			System.out.println("수");
		}else {
			System.out.println("잘못된 점수 입니다");
		}
	}
	
}
