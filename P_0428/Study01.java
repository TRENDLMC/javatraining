package P_0428;

public class Study01 {
	
 String name;
 int height;
 int weight;
 //필드선언
 
 
 
 
 public static void main(String[] args) {
	
	 Study01 gildong= new Study01();
	 Study01 chulsu= new Study01();
	 //객체선언
	 
	 
	 gildong.name="길동";
	 gildong.height=170;
	 gildong.weight=60;
	 //길동이라는 new객체에 값을대입
	 
	 chulsu.name="철수";
	 chulsu.height=166;
	 chulsu.weight=72;
	//철수이라는 new객체에 값을대입
	 
	 System.out.println("이름"+gildong.name);
	 System.out.println("신장"+gildong.height+"cm");
	 System.out.println("체중"+gildong.weight+"kg");
	 System.out.println();
	 System.out.println("이름"+chulsu.name);
	 System.out.println("신장"+chulsu.height+"cm");
	 System.out.println("체중"+chulsu.weight+"kg");
	 //단순출력 
}

}
