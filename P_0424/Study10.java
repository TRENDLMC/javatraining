package P_0424;

import java.util.Scanner;

public class Study10 {
	static int min(int a,int b,int c) {
		int min=a;
		//최솟값구하는 메소드 걍 형식 만알자 
		if(b<min) {
			min=b;
		}else if(c<min) {
			min=c;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.print("정수a:"); int a=sca.nextInt();
		System.out.print("정수b:"); int b=sca.nextInt();
		System.out.print("정수c:"); int c=sca.nextInt();
		
		System.out.println("최솟값은"+min(a,b,c)+"입니다");
	}

}
