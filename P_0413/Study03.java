package P_0413;

import java.util.Scanner;

public class Study03 {
	public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("실수a:"); int a= stdIn.nextInt();
	System.out.println("실수b:"); int b= stdIn.nextInt();
	
	int diff;
	
	if( a >= b) {
		diff =(a-b);
	}else { 
		diff= (b-a); 
	}
	System.out.println("두 값의 차는 "+diff+"입니다");
}
}

