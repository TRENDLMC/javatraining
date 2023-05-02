package P_0502;

public class Study04 {
	public static void main(String[] args) {
		Study03 a=new Study03();
		Study03 b=new Study03();
		Study03 c=new Study03();
		Study03.setStep(4);
		Study03 d=new Study03();
		Study03 e=new Study03();
		Study03 f=new Study03();
		
		
		System.out.println("a의식별번호"+a.getId());
		System.out.println("b의식별번호"+b.getId());
		System.out.println("c의식별번호"+c.getId());
		System.out.println("d의식별번호"+d.getId());
		System.out.println("e의식별번호"+e.getId());
		System.out.println("f의식별번호"+f.getId());
		
		int max=Study03.getMaxId();
		System.out.println("마지막에 부여한 식별번호"+max);
		System.out.println("다음에 부여할 식별 번호"+(max+Study03.getStep()));
		
		
	}

}
