package P_0504;

public class Study17 {
	static int compBalance(Account a,Account b) {
		long totalBalanceA=a instanceof Study16?
				((Study16)a).getBalance()+((Study16)a).getBalance()
				:a.getBalance();
		long  totalBalanceB=b instanceof Study16?
				((Study16)b).getBalance()+((Study16)b).getBalance()
				:b.getBalance();
		if(totalBalanceA>totalBalanceB) {
			return 1;
		}else if(totalBalanceA<totalBalanceB) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		
	
	Account gildong=new Account("길동","1231456",500);
	Study16 chulsua=new Study16("철수","654321",300,400);
	
	System.out.println("길동이와 철수의 예금 잔액 비교결과입니다");
	switch(compBalance(gildong, chulsua)) {
	case 0:System.out.println("둘의잔액은 같습니다");break;
	case 1:System.out.println("길동의 예금잔액이 많습니다"); break;
	case -1:System.out.println("철수의 예금잔액이 많습니다");break;
	}
	
	}
}
