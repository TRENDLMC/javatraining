package P_0504;

import java.net.MulticastSocket;

public class Study06 {
	public static void main(String[] args) {
		Study01 car1=new Study01("W140",1885,1490,5220
				,95.0,new Day(2018,10,13));
		Study02 car2=new Study02("W221",1845,1490,5205,90.0,
				new Day(2015,12,24));
		
		Study01 x;
		x=car1;
		x=car2;
		
		System.out.println("x구입일"+x.getPurchaseDay());
		
		Study02 y;
		//y=car1; 상위클래스형의 인스턴스는 참조할수없다
		y=car2;
		System.out.println("y구입일"+y.getPurchaseDay());
		System.out.println("y의 총주행거리"+y.getTotalMileage());
		
		
	}
}
