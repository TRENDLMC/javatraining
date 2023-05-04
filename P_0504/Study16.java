package P_0504;

public class Study16 extends Account {
	private long timeBalance;
	
	Study16(String name,String no,long balance,long timeBalance){
		super(name,no,balance);
		this.timeBalance=timeBalance;
	}
	long getTimeBalancce() {
		return timeBalance;
	}
	void cancel() {
		deposit(timeBalance);
		timeBalance=0;
	}
	
	
	

}
