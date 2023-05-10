package P_0510;

import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.print("문자열s1:"); String s1=sca.next();
		System.out.print("문자열s2:"); String s2=sca.next();
		
		int balance=s1.compareTo(s2);
		
		if(balance<0) {
			System.out.println("s1이작다.");
		}else if(balance>0) {
			System.out.println("s2가 작다");
		}else {
			System.out.println("s1과s2가 같다");
		}
	}

}
