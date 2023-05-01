package P_0501;

import java.util.Iterator;
import java.util.Scanner;

public class Study03 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.println("day1을 입력하자");
		System.out.print("년:");int y=sca.nextInt();
		System.out.print("달:");int m=sca.nextInt();
		System.out.print("월:");int d=sca.nextInt();
		
		Study02 day1=new Study02(y,m,d);
		System.out.println("day1="+day1);
		
		Study02 day2=new Study02(day1);
		System.out.println("day2를 day1과같은날짜로 만들었습니다");
		System.out.println("day2="+day2);
		
		if(day1.equalTo(day2)) {
			System.out.println("Day1과Day2가같습니다");
		}else {
			System.out.println("day1과day2가 다릅니다");
		}
		Study02 d1=new Study02();
		Study02 d2=new Study02(2017);
		Study02 d3=new Study02(2017,10);
		Study02 d4=new Study02(2017,10,15);
		
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		System.out.println("d3:"+d3);
		System.out.println("d4:"+d4);
		
		Study02[] a=new Study02[3];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=new Study02();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		
		
		
	}

}
