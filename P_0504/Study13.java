package P_0504;
/*
 * verLine클래스는 수직선을 나타내는 클래스이다
 * 이클래스는 직선을 나타내는 추상클래스 Study11로부터 파생된클래스이다
 */

public class Study13 extends Study11{
	/*
	 * 수직선을 생성하는 생성자이다
	 * 길이를 인수로받는다
	 * @param length생성할 직선의 길이
	 */
	public Study13(int length) {
		super(length);
	}
	/*
	 * toString 메서드는 수직선에 관련되 정보를 문자열로반환한다
	 * return문자열 Study12(length:3)을 반환한다
	 * 3부분은 길이에 해당하는 값이다
	 */
	public String ToString() {
		return "Study13(length:"+getLength()+")";
	}
	/** draw메서드는 수직선을그린다
	 * 세로선 기호'|'를 세로로 나열해서 그린다.
	 * 길이의 개수만큼'|'를 표시한후 줄바꿈하는것을 반복한다
	 */
	public void draw() {
		for (int i = 1; i <=getLength(); i++) {
			System.out.println('|');
			
		}
	}
	
	

}
