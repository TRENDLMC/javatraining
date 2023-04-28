package P_0428;

public class Study10 {
	
	private double x= 0.0;
	private double y=0.0;
	
	
	public Study10() {}
	
	
	public Study10(double x, double y) {set(x,y);}
	//생성자 오버로딩한것 
	public Study10(Study10 c) {this(c.x,c.y);}
	//이건 매개변수로 함수가들어온것
	public double getX() {return x;}
	public double getY() {return y;}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	//get set 메소드
	void set(double x,double y) {
		this.x = x;
		this.y = y;
	}
	//한개씩입력이아닌 두개의값이 입력됬을때 한번에 값을넣는 set명령어
	
	public boolean equalTo(Study10 c) {return x==c.x&&y==c.y;}
	//두개의 좌표값을 비교하는 명령어
	
	public String toString() {return "("+x+","+y+")";}
	//값을 문자열로 리턴하는 메소드 
}

