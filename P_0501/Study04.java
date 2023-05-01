package P_0501;

public class Study04 {
	private String name;
	private String no;
	private long balance;
	public Study04(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
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
	
	void deposit(long k) {
		balance +=k;
	}
	void withdraw(long k) {
		balance -=k;
	}
	
	
	
	

}
