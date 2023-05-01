package P_0501;

public class Human1 {
	
 private String name;
 private int height;
 private int weight;
 private Study02 birthday;
 //필드를 프라이빗으로 설정 그후 겟 명령어를 입력해서 값을 입력받음
 
 
 
 	public String getName() {
	return name;
 }

 	public Human1(String name, int height, int weight, Study02 birthday) {
	super();
	this.name = name;
	this.height = height;
	this.weight = weight;
	this.birthday = birthday;
	}

	public int getHeight() {
	return height;
	}

	public int getWeight() {
	return weight;
	}

	void gainWeight(int w){
		weight+=w;
	}
	//weight의값을변경해주는 메소드
	void reduceWeight(int w){
		weight-=w;
	}
	
	public Study02 getBirthday() {
		return birthday;
	}

	public void setBirthday(Study02 birthday) {
		this.birthday = birthday;
	}
	
	public void putData() {
		System.out.println("이름:"+name);
		System.out.println("신장:"+height+"cm");
		System.out.println("체중:"+weight+"kg");
	}

	public String toString() {
		return "{"+name+":"+height+"cm"+weight+"kg"+birthday+"출생}";
	}

}
