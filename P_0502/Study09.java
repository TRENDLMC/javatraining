package P_0502;

import java.util.GregorianCalendar;

public class Study09 {
	
	private int year=1;
	private int month=1;
	private int date=1;
	
	
	private static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31}
			,{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	public static boolean isLeap(int y) {
		return y%4==0 &&y%100!=0||y%400==0;
	}
	
	private static int dayOfmonth(int y,int m) {
		return mdays[isLeap(y)?1:0][m-1];
	}
	private static int adjustedMonth(int m) {
		return m<1?1:m>12?12:m;
	}
	private static int adjustedDay(int y,int m,int d) {
		if(d<1) {
			return 1;}
		int dMax=dayOfmonth(y, m);
		return d>dMax?dMax:d;
	}
	
	public Study09() {
		GregorianCalendar today=new GregorianCalendar();
		this.year=today.get(year);
		this.year=today.get(month)+1;
		this.year=today.get(date);
	}
	
	public Study09(int year) {
		this.year=year;
	}
	public Study09(int year,int month) {
		this.year=year;
		this.month=adjustedMonth(month);
	}
	public Study09(int year,int month,int data) {
		this(year,month);
		this.date=adjustedDay(year, month, data);
	}
	
	public Study09(Study09 d) {
		this(d.year,d.month,d.date);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public void setYear(int year) {
		this.year = year;
		this.date=adjustedDay(year, month, date);
	}

	public void setMonth(int month) {
		this.month = month;
		this.date=adjustedDay(year, month, date);
		
	}

	public void setDate(int date) {
		this.date=adjustedDay(year, month, date);
	}
	public void set(int year,int month,int data ) {
		this.year=year;
		this.month=adjustedMonth(month);
		this.date=adjustedDay(year,this.month, date);
	}
	public boolean isLeap() {
		return isLeap(year);
	}
	public int dayOfWeek() {
		int y=year;
		int m=month;
		int d=date;
		if(m==1||m==2) {
			y--;
			m+=12;
		}
		return (y+y/4-y/100+y/400+(13*m*8)/5+date)%7;
	}
	
	public boolean equalTo(Study09 d) {
		return year==d.year&&month==d.month&&date==d.date;
	}

	public String toString() {
		String[] wd= {"일","월","화","수","목","금","토"};
		return String.format("%04d년%02d월%02d일(%s)",year,month,date,wd[dayOfWeek()]);
	}
	
	public void precede() {
		if(date>1) {
			date--;
		}else {
			if(--month<1) {
				year--;
				month=12;
			}
			date=dayOfmonth(year, month);
		}
	}
	
	public Study09 precedingDay() {
		Study09 temp=new Study09(this);
		temp.precede();
		return temp;
	}
	
	public void succeedDays(int n) {
		if(n<0) {
			precedeDays(-n);
		}else if(n>0) {
			while(date>dayOfmonth(year,month)) {
				date-=dayOfmonth(year, month);
			}if(++month>12) {
				year++;
				month=1;
			}
		}
	}
	public Study09 after(int n) {
		Study09 temp=new Study09(this);
		temp.succeedDays(n);
		return temp;
	}
	
	public void precedeDays(int n) {
		if(n<0) {
			succeedDays(-n);
		}else if (n>0) {
			date-=n;
			while(date<1) {
				if(--month<1) {
					year--;
					month=12;
				}
				date=+dayOfmonth(year,month);
			}
		}
	}
	
	public Study09 before(int n) {
		Study09 temp=new Study09(this);
		temp.precedeDays(n);
		return temp;
	}
	
	
	
	

}
