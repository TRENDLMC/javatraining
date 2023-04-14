package P_0414;

import java.util.Scanner;

public class Study06 {
public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	System.out.println("카운트합니다");
	int x;
	do {
		System.out.print("양의정수값");
		x=stdIn.nextInt();
		
	}while(x<=0);
	
	while(x>0) {// 0이 되면 정지해라 
		System.out.println(x--); // x-- x에서 1을뺴라 이것을 0이될떄까지반복
		System.out.println("x의값이"+x+"이됐습니다");
	}
}
}
