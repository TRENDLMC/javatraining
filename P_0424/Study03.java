package P_0424;

import java.util.Scanner;

public class Study03 {
	static int med3(int a,int b,int c) {
		//중간값구하는 메소드
		if(a>=b) {
			//a와b를 비교하여 a가 작거나 같으면 아래문실행 
			if(b>=c) {
				//b가 c보다 크면 a보다 작고 c보단 큰값이므로 중간이다
				return b;
			}else if(a<=c) {
				//a가 b보다 크고 c보다작으므로 중간값이되므로 a를 리턴 아래는 반복문 
				return a;
			}else {
				return c;
				//둘다 틀렸을경우 만족하는값은 하나 c를 출력 
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		
		System.out.print("정수 a:"); int a=sca.nextInt();
		System.out.print("정수 b:"); int b=sca.nextInt();
		System.out.print("정수 c:"); int c=sca.nextInt();
		
		System.out.println("중간값은:"+med3(a,b,c));
	}

}
