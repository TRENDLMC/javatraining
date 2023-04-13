package P_0413;

import java.util.Scanner;

public class Study09 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수a:"); int a= stdIn.nextInt();
		System.out.println("정수b:"); int b= stdIn.nextInt();
		
		if(a==b)
			System.out.println("두 값이 같습니다");
		else {
			int min,max;
			if(a<b) {
				min=a;
				max=b;
			}else {
				min=b;
				max=a;
			}
			System.out.println("작은값은"+min+"입니다 ");
			System.out.println("큰값은"+min+"입니다 ");
			
		}
	
	}

}
