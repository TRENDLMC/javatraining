package P_0414;

import java.util.Scanner;

public class Study04 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("정수a:"); int a=stdIn.nextInt();
		
		System.out.print("정수b:"); int b=stdIn.nextInt();
		if(a>b) {
			int t=a;
			a=b;
			b=t;
		
		}
		do {
			System.out.println(a+"");
			a++;
		}while (a<=b);
		System.out.println();
		
	}

}
