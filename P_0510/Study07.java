package P_0510;

import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("문자열s1:"); String s1=sca.next();
		System.out.print("문자열s2:"); String s2=sca.next();
		
		if(s1==s2) {
			System.out.println("s1==s2입니다");
		}else {
			System.out.println("s1!=s2입니다");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1과 s2의내용은같습니다");
		}else {
			System.out.println("s1과s2의내용은 다릅니다");
		}
	}
}
