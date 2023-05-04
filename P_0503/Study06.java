package P_0503;

import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.print("계좌 개설수:");
		int n=sca.nextInt();
		Study05[] a=new Study05[n];
		
		for (int  i= 0;  i< a.length; i++) {
			System.out.print("[0]...간이/[2]...상세");
			int type=sca.nextInt();
			System.out.println("계좌정보를 입력하세요.");
			System.out.print("명  의:");String name=sca.next();
			System.out.print("번  호:");String no=sca.next();
			if(type==0) {
				a[i]=new Study05(name, no);
			}else {
				System.out.print("잔고"); int balance=sca.nextInt();
				System.out.print("개설연도"); int y=sca.nextInt();
				System.out.print("개설 월"); int m=sca.nextInt();
				System.out.print("개설 일"); int d=sca.nextInt();
				a[i]=new Study05(name, no, balance, new Day(y,m,d));
			}
			System.out.println("계좌 기본정보"+a[i]);
			System.out.println("식별 번호"+a[i].getId());
			System.out.println("계좌 개설일"+a[i].getOpenDay().toString());
		}
		
		
	}

}
