package P_0419;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {
		Scanner strIn=new Scanner(System.in);
		
		System.out.print("정수:");
		int x=strIn.nextInt();
		
		System.out.printf("8진수는%o입니다.\n",x);
		System.out.printf("16진수%x입니다.\n",x);
		//printf문에서도 1% 첫번쨰자리를 o로하면 8진수 x로하면 16진수로변환된다
	}

}
