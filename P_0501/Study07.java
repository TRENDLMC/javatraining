package P_0501;

import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("계좌 정보를 입력하세요.");
	System.out.print("명의:");
	String name=sca.next();
	System.out.print("번호:");
	String no=sca.next();
	System.out.print("잔고:");
	long balance =sca.nextLong();
	System.out.print("개설연도:");
	int y= sca.nextInt();
	System.out.print("개설월:");
	int m= sca.nextInt();
	System.out.print("개설일:");
	int d= sca.nextInt();
	
	Study05 a= new Study05(name, no, balance, new Study02(y,m,d));
	
	System.out.println("계좌 기본정보:"+a);
	System.out.println("개설일:"+a.getOpenDay().toString());
	}

}
