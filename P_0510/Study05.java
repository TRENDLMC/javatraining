package P_0510;

import java.util.Scanner;

public class Study05 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("문자열s:");
		String s=sca.next();
		
		for (int i = 0; i < s.length()  ; i++) {
			System.out.printf("s[%d]=%c %4X \n",i,s.charAt(i),(int)s.charAt(i));
		}
	}

}
