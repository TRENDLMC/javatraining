package P0412;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Study06 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("변수a:"); int a = stdIn.nextInt();
		System.out.println("변수b:"); int b = stdIn.nextInt();
		
		
		if(a>b) {
			System.out.println("a값이 큽니다");
	
		}else if(a<b) {
					
			System.out.println("b값이 큽니다");
		}else {
		System.out.println("값이 같습니다");
		}
}

}
