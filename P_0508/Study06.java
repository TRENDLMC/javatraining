package P_0508;

import java.util.Iterator;
import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.print("삼각형의 개수:");
		int no=sca.nextInt();
		
		Study01[] p=new Study01[no];
		
		for (int i = 0; i <no; i++) {
			int type;
			do {
				System.out.print((i+1)+"번의삼각형의종류(1..좌하 직각/2..좌상 직각/3..우하 직각/4..우상직각):");
				type=sca.nextInt();
			}while(type<1||type>4);
			
			System.out.print("길이:");int len=sca.nextInt();
			p[i]=(type==1)? new Study02(len):  (type==2)?new Study03(len): (type==3)? new Study04(len): new Study05(len);
			//3항연산자 마지막에 다시조건을 줘서 두개중  하나선택하게 함 
			
		}
		for (Study01 study01 : p) {
			study01.print();
			System.err.println(
					);
		}
		
	}

}
