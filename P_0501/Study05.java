/package P_0501;

public class Study05 {
	private String name;
	private String no;
	private long balance;
	private Study02 openDay;
	
	public Study05(String name, String no, long balance,Study02 d) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		openDay =new Study02(d);
	}
	
	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}
	public long getBalance() {
		return balance;
	}
	
	public Study02 getOpenDay() {
		return new Study02(openDay);
	}

	void deposit(long k) {
		balance +=k;
	}
	void withdraw(long k) {
		balance -=k;
	}
	
	public String toString() {
		return "{"+name+","+no+","+balance+"}";
	}

}
