package P_0508;

public class Study05 extends Study01 {

	/*우상가 직각인 이등변 삼가형을 생성한다
	 * 한 변의 길이를 인수로 받는다.
	 * @Paramlength 생성할 이등변 삼각형의 한변의 길이
	 */
	
	public Study05(int length) {
		super(length);
	}
	/*
	 * toStirng은 우상이 직각인 삼각형의 정보를 문자열로 반환한다
	 * return문자열 Study03)length:3);을 반환한다
	 * 3부분은 길이에 해당하는 값이다
	 */
	@Override
	public String toString() {
	return "Study05(length:"+getLength()+")";
	}
	/*
	 * draw는 우상가 직각인 삼각ㄷ형을 그린다
	 * 별표로 나열해서그린다 
	 */
	
	public void draw() {
		for (int i =getLength(); i >=1;i--) {
			for (int j = 1; j <=getLength()-i; j++) {
				System.out.print(' ');
			}for (int j = 1; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}
