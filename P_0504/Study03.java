package P_0504;

public class Study03 {
	public static void main(String[] args) {
		Study02 myCar=new Study02("w221",1845,1490,5205,90.0,new Day(2015,12,24));
	System.out.printf("현재위치:(%.2f,%.2f)\n",myCar.getX(),myCar.getY());	
	System.out.printf("남은연료:%.2f리터\n",myCar.getFuel());
	System.out.printf("구입일 :%s\n",myCar.getPurchaseDay());
	

		
	}

}
