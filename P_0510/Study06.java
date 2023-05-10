package P_0510;

import java.util.Scanner;

public class Study06 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("문자열s1:"); String s1=sca.next();
		System.out.print("문자열s2:"); String s2=sca.next();
		
		int idx=s1.indexOf(s2);
		if(idx==-1) {
			System.out.println("s1안에s2가 포합돼 있지않습니다");
		}else {
			System.out.println(s1);
			for (int i = 0; i <idx; i++) {
				System.out.print(' ');	
			}System.out.println(s2);
		}
	}

}
