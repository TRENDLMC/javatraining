package P_0501;

public class Study06 {
	public static void main(String[] args) {
		Study02 d=new Study02(2010,10,15);
		Study05 gildong=new Study05("길동","125768,",100,d);
		
		Study02 p=gildong.getOpenDay();
		System.out.println("계좌 개설일:"+p);
		
		p.set(1999,12,31);
		
		Study02 q=gildong.getOpenDay();
		System.out.println("계좌개설일:"+q);
	}

}
