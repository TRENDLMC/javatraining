package P_0504;
/*
 * Study09클래스는 도형의 개념을 나타내기위한 추상클래스이다.
 * 추상클래이므로 이 클래스의 인스턴스를 생성할 수 없다.
 * 구체적인 도형 클래스는 이 클래스로부터 파생된다.
 * @autgor 시바타
 * @see object
 */

public abstract class Study09 {
	/*
	 * 도형 정보를 나타내는 문자열을 반환하는 추상메서드이다
	 * Study09 클래스에서 파생되는 클래스에서 이메서드를 구현한다
	 * 이메서드는 jva.langobject클래스의 메서드를 추상메서드로
	 * 오버라이드한 메서드이다
	 */
	public abstract String toString();
	/*
	 * draw메서드는 도형을 그리기 위한 추상메서드이다.
	 * Study09클래스에서 파생되는 클래스에서 이메서드를 구현한다
	 */
	public abstract void draw();
	/*
	 * print 메서드는 도형 정보의 표시하고 도형자체를 그린다
	 * 구체적으로는 다음 두단계를 따른다.
	 * step 1. to String 메서드가 반호나하는 문자열을 표시하고 줄바꿈
	 * step 2. draw메서드를 호출해서 도형을 그림
	 */
	
	public void print() {
		System.out.println(toString());
		draw();
	}

}
