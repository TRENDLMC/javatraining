package P_0420;

public class Study03 {
	public static void main(String[] args) {
		System.out.println("x\tx의 제곱");
		System.out.println("-------------");
		
	
		for(float x=0.0f;x<=1.0f;x+=0.001f) {
			//float 타입 x변수선언 후0.0f로 초기화 한후 x가 1.0f과같을때까지실행해라 증감식은 0.001f를더한다 즉 1000번실행한다
			System.out.printf("%5.3f\t%10.7f\n",x,x*x);
			//마찬가지로 5자리표시하되 소수점 3자리 10자리표시하되 소수점은7자리까지 \n은 개행을 바꿔라 
			
		}
	
		
	}

}
