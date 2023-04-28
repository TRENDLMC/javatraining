package P_0428;

import java.util.Scanner;

public class Study05 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.println("차량 데이터를 입력하세요");
		System.out.print("이  름:"); String name=sca.next();
		System.out.print("번  호:"); String number=sca.next();
		System.out.print("전  폭:"); int width=sca.nextInt();
		System.out.print("전  고:"); int height=sca.nextInt();
		System.out.print("전  장:"); int length=sca.nextInt();
		System.out.print("탱크용량:"); double tank=sca.nextDouble();
		System.out.print("연료량:"); double fuel=sca.nextDouble();
		System.out.print("연  비:"); double sfc=sca.nextDouble();
		
		Study03 myCar=new Study03(name, number, width, height, length, tank, fuel, sfc);
		//study03의 실행문 생성자에게 입력받은값을 넣어줬다 
		
		
		while(true) {
			//출력문 
			System.out.printf("현재위치:(%.2f,%.2f)\n",myCar.getX(),myCar.getY());
			System.out.printf("남은연료:%.2f\n",myCar.getfuel());
			System.out.print("이동하겠습니까?[0....no/1....yes]:");
			if(sca.nextInt()==0) {
				break;
			}
			System.out.print("x방향으로의 이동거리");
			double dx=sca.nextDouble();
			
			System.out.print("y방향으로의 이동거리");
			double dy=sca.nextDouble();
			
			if(!myCar.move(dx, dy)) {
				System.out.println("연료부족!!");
			}
		}
	}

}
