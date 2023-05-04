package P_0503;

import java.util.GregorianCalendar;

public class Study03 {
	private static int counter=0;
	private static int day;
	
	private int x=0;
	private int y=0;
	
	static{
		GregorianCalendar today=new GregorianCalendar();
		day=today.get(day);
	}
	
	{if(--counter==day) {
		System.out.print("당첨!!");
		System.out.printf("오늘 %d개의 좌표가 생성했습니다\n",counter);
		}
	}
	
	public Study03() {
		if(++counter==day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가생성됐습니다.\n",counter);
		}
	}
	public Study03(int x) {
		if(++counter==day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가생성됐습니다.\n",counter);
		}
		this.x=x;
	}
	public Study03(int x,int y) {
		if(++counter==day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가생성됐습니다.\n",counter);
		}
		this.x=x;
		this.y=y;
	}
	
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	public static int getCounter() {return counter;}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	

	
	
	
	
	

}
