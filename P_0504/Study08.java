package P_0504;

public class Study08 {
	public static void main(String[] args) {
		Study01 car1=new Study02("W221",1845,1490,5205,90.0,new Day(2015,12,24));
		car1.move(10,10);
		//System.out.println("총주행거리:"+car1.getTotalMileage());
		System.out.println("총주행거리:"+((Study02)car1).getTotalMileage());
	}

}
