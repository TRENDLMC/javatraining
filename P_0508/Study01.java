package P_0508;
/*
 * abstTriangle 클래스는 직각이등변 삼각형을 나타내는 추상클래스이다.
 * 이클래스는 도형을 나타내는 추상 클래스 shape로부터파생된 클래스이다
 * 추상클래스므로 인스턴스를 생성할수없다
 * 구체적인 짖각 이등변 삼각형 클래스는 이 클래스로부터 파생시킨다
 */
public abstract class Study01 extends Shape{
	
	/*
	 * 한 ㅠㅕㄴ의 길이를 나타내는 int형 필드
	 */
	private int length;
	
	/*
	 * 직각 이등변 삼각형을 생성하는 생성자이다
	 * 한변의 길이를 인수로 받는다
	 * param length생성할 이등변삼각형의 한변의길이
	 */
	public Study01(int length) {
		setLength(length);
	
		/*한변의 길이를 반호나한다
		 * return 한변의 길이
		 */
	}
	public int getLength() {
		return length;
	}
	/*한변의길이를 설정한다
	 * param length
	 */
	public void setLength(int length) {
		this.length=length;
	}
	
	/*to String 메서드는 이등변 삼각혀오가 관련되 정보를 문자열로반환한다
	 * return문자열 Study01(length:3)"을 반환한다
	 * 3은 하변의 길이에 해당하는값이다
	 */
	@Override
	public String toString() {
	return "Study01(length:"+length+")";
	}
	

}
