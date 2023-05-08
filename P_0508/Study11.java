package P_0508;

import lombok.Getter;

@Getter
public class Study11 {
	private String name;
	private int heigth;
	private int weigth;
	private Day birthday;
	
	public Study11(String name, int heigth, int weigth, Day birthday) {
		super();
		this.name = name;
		this.heigth = heigth;
		this.weigth = weigth;
		this.birthday = new Day(birthday);
	}
	
	public void gainWeigth(int w) {
		weigth+=w;
	}
	
	public void reduceWeight(int w) {
		weigth-=w;
		
	}
	public void putData() {
		System.out.println("이름"+name);
		System.out.println("신장"+heigth+"cm");
		System.out.println("체중"+weigth+"kg");
		
	}
	@Override
	public String toString() {
		return "{"+name+":"+heigth+"kg"+weigth+"cm"+birthday+"출생";
	}
	
	
	

}
