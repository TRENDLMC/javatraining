package P_0504;
/*
 * Study12클래스는 수평선을 나타내는 클래스이다
 * 이클래스는 직선을 나타내는 추상클래스 Study11에서 파생된클래스이다
 */
public class Study12 extends Study11 {
	/*
	 * 수평선을 생성하는 생성자이다
	 * 길이를 인수로받는다
	 * param length 생성할 직선의길이
	 */
	public Study12(int length) {
		super(length);
	}
	/*
	 * toSting 메서드는 수평선에 관련된 도형정보를 문자열로반환한다
	 * return문자열 Study12(length:3)을 반환한다
	 * 3부분은 길이에 해당하는 값이다
	 */
	public String ToString() {
		return "Study12(length:"+getLength()+")";
	}
	/*
	 * draw메서드는 수평선을 그린다
	 * 마이너스 기호'-'를 옆으로 나열해서 그린다
	 * 길이의 개수만큼 '-'를 연속으로 표시한후 줄바꿈한다
	 */
	public void draw() {
		for (int i = 1; i <=getLength(); i++) {
			System.out.print('-');
		}System.out.println();
	}

}
