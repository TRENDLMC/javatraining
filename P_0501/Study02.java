package P_0501;

import java.time.DayOfWeek;

public class Study02 {
	private int year=1;
	private int month=1;
	private int date=1;
	public Study02() {}
	public Study02(Study02 d){this(d.year,d.month,d.date);}
	public Study02(int year) {this.year = year;}
	public Study02(int year, int month) {this.year = year;this.month = month;}
	public Study02(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public int getDate() {
		return date;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void set(int year,int month,int date) {
		this.year=year;
		this.month=month;
		this.date=date;
	}
	
	
	public int dayOFWeek() {
		int y=year;
		int m=month;
		if(m==1||m==2) {
			y--;
			m+=12;
		}
		return(y+y/4-y/100+y/400+(13*m+8)/5+date)%7;

		
	}
	
	public boolean equalTo(Study02 d) {
		return year==d.year&&month==d.month&&date==d.date;
	}
	
	public String toString() {
		String[] wd= {"일","월","화","수","목","금","토"};
		return String.format("%04d년 %02d월 %02d일(%s)",
				year,month,date,wd[dayOFWeek()]);
	}
}
