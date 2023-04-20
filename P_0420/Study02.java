package P_0420;

public class Study02 {
	public static void main(String[] args) {
		System.out.println("float\t\t int");
		System.out.println("-------------");
		
		float x= 0.0f;
		// float타입 변수x를 선언하고 초기화
		for(int i=0; i<=1000; i++,x+=0.001f) {
			// int타입 i선언후 0으로초기화 조건문i가1000이랑같아질떄까지 실행,증감문 i를1씩증감 x는0.001씩증가)
			System.out.printf("%9.7f  %9.7f\n",x,(float)i/1000);
			// %9.7= 9자리를표시해라 소수점은7쨰짜리까지 표시 f는 실수타입이라서적어줌 문자s 정수d
			//또다른표현법 %1$9.7f %2$9.7f가있다
		}
	
		
	}

}
