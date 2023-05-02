package P_0502;

public class Study02 {
public static void main(String[] args) {
	Study01 a=new Study01();
	Study01 b=new Study01();
	
	System.out.println("a의 식별번호"+a.getId());
	System.out.println("b의 식별번호"+b.getId());
	
	System.out.println("Id.conuter="+Study01.getMaxId());
	System.out.println("a.conuter="+a.getMaxId());
	System.out.println("b.conuter="+b.getMaxId());
	//정적메소드로 저장해놨기떄문에 프로그램이 종료될떄까지 값이 유지된다 
	
}
}