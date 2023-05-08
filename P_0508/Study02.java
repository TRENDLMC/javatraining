package P_0508;

/*
 * Study02 클래스는 좌하가 직각인 이등변삼각형 클래스이다
 * 이클래스는 직각 이등변 삼각형을 나타내는
 * 추상클래스 Study01의 파생클래스이다
 */
public class Study02 extends Study01{
	
	/*좌하가짖각인 이등변 삼각형을 생성한다
	 * 한변의 길이를 인수로받는다
	 * 파라메드 length생성할 이등변 삼각형의 한변의 길이
	 */
	public Study02(int length) {
		super(length);
	}
	/*
	 * toString 좌하가 직각인 삼각형의 정보를 문자열로 반환한다
	 * @return문자열"Study02(lenth:3)을 반환한다
	 * 3부분은 길이에 해당하는 값이다
	 */
	@Override
	public String toString() {
	return "Study02(length:"+getLength()+")";
	}

	public void draw() {
		for (int i = 1; i <= getLength(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}System.out.println();
			
		}
		
	}
}
