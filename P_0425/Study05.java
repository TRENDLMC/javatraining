package P_0425;

import java.util.Scanner;

public class Study05 {
	static void putChars(char c, int n) {
		while (n-- > 0 ) {
			//증감연사자n을 1씩뺴라 반복 n이 0보다작아질떄까지
			System.out.print(c);
			//출력해라 c를
		}
	}
	
	static void pitStars(int n) {
		putChars('*', n);
		//char타입문자는 *이다 
	}
	
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼강형을 표시합니다");
		System.out.print("단수는:");
		int n=sca.nextInt();
		for(int i=1; i<=n;i++) {
			pitStars(i);
			//i번실행해라 i는 내가입력한 단수에영향을받는다 
			System.out.println();
			//한칸띄워라
		}
	}

}
/*참고 문제 4_22번부터
  for(int i =1;i<=n;i++){
  for(int j=1;j<=n;j++){
 	System.out.print('*')
 	System.out.println();
 	*/

