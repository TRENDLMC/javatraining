package P_0504;

public class Study10 extends Study09 {
	/*
	 * Study10 클래스는 점을 나타내는 클래스이다
	 * 이클래스는 도형을 나타내는 추상 클래스 study09로부터 파생된 클래스이다
	 * 필드는없다
	 */
	public Study10() {
		
	}
	/*
	 * to Stirng 메서드는 점에 관련되 도형정보를 문자열로 반환한다
	 * 반호나하는 문자열은 항상 Study10이다
	 * @return문자열 Study10을반환한다
	 */
	public String toString() {
		return "Study10";
	}
	/*
	 * draw메서드는 점을 그리는 메서드이다.
	 * 플러기호 '+'를 1개만 표시하고 줄바꿈한다
	 */
	public void draw() {
		System.out.println('+');
	}

}
