package P_0501;

public class Study12 {
	public static void main(String[] args) {
		Study11 gildong=new Study11("홍길동",170,60);
		Study11 chulsu=new Study11("김철수",166,72);
		
		gildong.putData();
		System.out.println("번호:"+gildong.getId());
		System.out.println();
		chulsu.putData();
		System.out.println("번호:"+chulsu.getId());
		
	}

}
