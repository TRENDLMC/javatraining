package P_0419;

import java.util.Scanner;

public class Study09 {
public static void main(String[] args) {
	Scanner strIn=new Scanner(System.in);
	
	System.out.println("정수값 x,y,z의 평균을 구합니다");
	System.out.print("x값:"); int x=strIn.nextInt();
	System.out.print("y값:"); int y=strIn.nextInt();
	System.out.print("z값:"); int z=strIn.nextInt();
	
	double ave=(x+y+z)/3.0;
	//계산식의 변수를 double으로 먼저변환시켜서 계산하여야 소주점자리도 정확하게 얻을수있다
	
	System.out.printf("x,y,z의 평균값은 %.3f입니다\n",ave);
}
}
