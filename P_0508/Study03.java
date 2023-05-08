package P_0508;
/*Study03 클래스는 좌상이 직각인 이등변 삼각형 클래스이다
 * 이클래스는 직각 이등변 삼각형을 나타내는
 * 추상클래스 Study01로부터 파생된클래스이다
 */

public class Study03 extends Study01{

	/*좌상이 직각인 이등변 삼가형을 생성한다
	 * 한 변의 길이를 인수로 받는다.
	 * @Paramlength 생성할 이등변 삼각형의 한변의 길이
	 */
	
	public Study03(int length) {
		super(length);
	}
	/*
	 * toStirng은 좌상이 직각인 삼각형의 정보를 문자열로 반환한다
	 * return문자열 Study03)length:3);을 반환한다
	 * 3부분은 길이에 해당하는 값이다
	 */
	@Override
	public String toString() {
	return "Study03(length:"+getLength()+")";
	}
	
	public void draw() {
		for (int i = getLength(); i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print('*');
			}System.out.println();
		}
		
	}
	
}
