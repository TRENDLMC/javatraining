package P_0510;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("문자열:"); String s=sca.next();
		
		System.out.println("반대로읽으면");
		for (int i =s.length()-1;i>=0; i--) {
			System.out.print(s.charAt(i));
			
		}System.out.println("입니다");
	}

}
