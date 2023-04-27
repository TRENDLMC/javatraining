package P_0427;

import java.util.Scanner;

public class Study09 {
	static void prinVBits(byte x) {
		for(int i=7;i>=0;i-- ) {
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
	}
	static void prinVBits(short x) {
		for(int i=15;i>=0;i-- ) {
			System.out.print(((x>>>i & 1)==1)?'1':'0');
		}
	}
	static void prinVBits(int x) {
		for(int i=31;i>=0;i-- ) {
			System.out.print(((x>>>i & 1)==1)?'1':'0');
		}
	}
	static void prinVBits(long x) {
		for(int i=63;i>=0;i-- ) {
			System.out.print(((x>>>i & 1)==1)?'1':'0');
		}
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("byte형의 정수a의값");byte a=sca.nextByte();
		System.out.print("short형의 정수a의값");short b=sca.nextShort();
		System.out.print("int형의 정수a의값");int c=sca.nextInt();
		System.out.print("long형의 정수a의값");long d=sca.nextLong();
		
		System.out.print("a의비트");prinVBits(a);
		System.out.print("\nb의비트");prinVBits(b);
		System.out.print("\nc의비트");prinVBits(c);
		System.out.print("\nd의비트");prinVBits(d);
		System.out.println();
	}
	
	

}
