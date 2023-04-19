package P_0419;

import java.util.Scanner;

public class Study08 {
public static void main(String[] args) {
	Scanner strIn=new Scanner(System.in);
	
	System.out.println("정수값 x,y,z의 평균을 구합니다");
	System.out.print("x값:"); int x=strIn.nextInt();
	System.out.print("y값:"); int y=strIn.nextInt();
	System.out.print("z값:"); int z=strIn.nextInt();
	
	double ave=(x+y+z)/3;
	//계산식의 변수를 실수로 바꾸지않아서 0.3이 떨어져나감왜냐? 대입되기전에는 int타입이기떄문에 
	
	System.out.printf("x,y,z의 평균값은 %.3f입니다\n",ave);
}
}
