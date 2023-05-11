package P_0511;

import java.util.Scanner;

public class Study02 {
	
	static int mul(int x,int y) {
		return x*y;
	}
	
	static int div(int x,int y) {
		return x/y;
	}
	static void muldiv(int x,int y) {
		System.out.println("x*y"+mul(x,y));
		System.out.println("x/y"+div(x,y));
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		try {
			System.out.print("x값:");int x=sca.nextInt();
			System.out.print("y값:");int y=sca.nextInt();
			muldiv(x, y);
		}catch (IncompatibleClassChangeError e) {
		System.out.println("입력오류발생"+e);
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("산술 오류발생"+ e);
			e.printStackTrace();
		}finally {
			System.out.println("프로그램을 종료합니다");
		}
	}

}
