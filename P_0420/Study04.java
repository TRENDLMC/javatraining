package P_0420;

public class Study04 {
	public static void main(String[] args) {
		System.out.println("x\tx의 제곱");
		System.out.println("-------------");
		
	
		for(int i=0 ; i<=1000 ; i++) {
			//증감식에서int타입으로 실행하고 
			float x=(float)i/1000;
			// 마지막에 float로 int 타입 i를 나누기 1000을 해줘도 결과는 같다 
			System.out.printf("%5.3f\t%10.7f\n",x,x*x);
			
		}
	
		
	}

}
