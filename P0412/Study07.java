package P0412;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Study07 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("변수a:"); int a = stdIn.nextInt();
		System.out.println("변수b:"); int b = stdIn.nextInt();
		
		int diff = a - b; 
		
		if(diff>0) {
			System.out.println("a가 큽니다");
	
		}else if(diff<0) {
			System.out.println("b가 큽니다");
		}else {
			System.out.println("값이 같습니다");
		}
}

}
