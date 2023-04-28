package P_0428;

import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		System.out.println("좌표p를 입력하세요");
		System.out.print("좌표 x:");double x=sca.nextDouble();
		System.out.print("좌표 y:");double y=sca.nextDouble();
		
		Study06 p=new Study06(x, y);
		//좌표 x와y값을 study06에 프라이빗필드에 저장함 
		
		System.out.println("p=("+p.getX()+","+p.getY()+")");
		//get명령어로 프라이빗 필드의 값을 받아욤
		
		Study06 q=p;
		//새로운 객체를 만든것이아닌 전에사용하던 객체를 그대로복사했기떄문에 
		
		q.set(9.9,9.9);
		//q.set으로 값을바꿔주면 p의 값도 변경됨 
		System.out.println("p=("+p.getX()+","+p.getY()+")");
		System.out.println("q=("+q.getX()+","+q.getY()+")");
	}

}
