package P_0428;

public class Study02 {
	
 private String name;
 private int height;
 private int weight;
 //필드를 프라이빗으로 설정 그후 겟 명령어를 입력해서 값을 입력받음
 
 public String getName() {
	return name;
}

public int getHeight() {
	return height;
}

public int getWeight() {
	return weight;
}

public Study02(String name, int height, int weight) {
	this.name = name;
	this.height = height;
	this.weight = weight;
}
//생성자 생성 

	void gainWeight(int w){
		weight+=w;
	}
	//weight의값을변경해주는 메소드
	void reduceWeight(int w){
		weight-=w;
	}
public static void main(String[] args) {
	
	 Study02 gildong= new Study02("길등",170,60);
	 
	 Study02 chulsu= new Study02("철수",166,72);
	 
	 gildong.gainWeight(3);
	 chulsu.reduceWeight(5);

	 System.out.println("이름"+gildong.name);
	 System.out.println("신장"+gildong.height+"cm");
	 System.out.println("체중"+gildong.weight+"kg");
	 System.out.println();
	 System.out.println("이름"+chulsu.name);
	 System.out.println("신장"+chulsu.height+"cm");
	 System.out.println("체중"+chulsu.weight+"kg");
}

}
