package P_0414;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner stdInd=new Scanner(System.in);
		
		int x;
		do {
			System.out.println("세자리의 정수값");
			x=stdInd.nextInt();
		}while(x<100||x>999); { // ||문 둘중하나라도 true 라면 true   // &&는 둘다ture 여야 true출력 
			System.out.println("입력한 값은"+x+"입니다");
	}

}
}
