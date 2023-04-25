package P_0425;

import java.util.Random;
import java.util.Scanner;

public class Study08 {
	static Scanner sca=new Scanner(System.in);
	static boolean confirmmRetry() {
		int cont;
		do {
			System.out.print("다시한번<1...yse/0....no:");
			cont=sca.nextInt();
		}while(cont!=0&&cont!=1);
		return cont==1;
	}
	
	
	public static void main(String[] args) {
		Random rand=new Random();
		System.out.println("암산훈련!!");
		
		do {
			int x= rand.nextInt(900)+100;
			int y= rand.nextInt(900)+100;
			int z= rand.nextInt(900)+100;
			int pattern=rand.nextInt(4);
			
			
			int answer;
			switch(pattern) {
			case 0: answer=x+y+z;break;
			case 1: answer=x+y-z;break;
			case 2: answer=x-y+z;break;
			default: answer=x-y-z;break;
			
			}while(true) {
				System.out.print(x+((pattern<2) ?"+":"-")+
						//삼항연산자x다음에 +or-가나오는것을 조절
								 y+((pattern%2==0)?"+":"-")+
								//삼항연산자x다음에 +or-가나오는것을 조절
								 z+"=");
				int k=sca.nextInt();
				if(k == answer){
					//default값을 주지않으면 값이넘어오지않을수도있기떄문에 값이저장이되지않는다고 판단
					// 오류발생한다 
					break;
				}else {
					System.out.println("틀렸습니다");
				}
			}
		}while(confirmmRetry());
	}

}
