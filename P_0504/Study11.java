package P_0504;
/*
 * AbstLine 클래스는 직선을 나타내는 추상클래스이다
 * 이클래스는 도형을 나타내는 추상클래스 Study09로부터 파생되는 클래스이다
 * 추상클래스이므로 본클래스의 인스턴스를 생설할수없다.
 * 구체적인 직선클래스는 이클래스를 통해 파생된다
 * 
 */

public abstract class Study11 extends Study09 {
	
	/*
	 * 직선의 길이를 나태는 int형 필드
	 */
	
	private int length;
	
	/*직선을 생성하는 생성자이다
	 * 길이를 인수로 받는다
	 * @param length 생성할 직선의 길이
	 */
	
	public Study11(int length) {
		setLength(length);
	}
	
	/*
	 * 직선의 길이를 반호나한다
	 * @return 직선의길이
	 */
	public int getLength() {
		return length;
	}
	/*직선의 길이를 설정한다
	 * param length 설정할 직선의 길이 
	 * 
	 */
	public void setLength(int length) {
		this.length=length;
	}
	/*
	 * toString 메서드는 직선에 과련되 도형 정보를 문자열로 반환한다
	 * return 문자열 abstLine(length:3)을 반호나한다
	 * 3부분은 길이에 해당하는 값이다
	 */
	public String toString() {
		return "AbstLine(length:"+length+")";
	}
	
	
	
}
