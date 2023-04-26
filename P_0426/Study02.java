package P_0426;

import java.util.Scanner;

public class Study02 {
	
	static void printBit(int x) {
		for(int i=31;i>=0;i--) {
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
	}

	static int setN(int x,int pos,int n) {
		return x|(~(~0<<n)<<pos);
	}
	
	static int resetN(int x,int pos,int n) {
		return x&~(~(~0<<n)<<pos);
	}
	
	static int inverseN(int x, int pos,int n) {
		return x ^ (~(~0<<n)<<pos);
	}
	
	
	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		
		System.out.println("정수의 pos번쨰 비트를 변경합니다");
		System.out.print("x:"); int x=sca.nextInt();
		System.out.print("pos:"); int pos=sca.nextInt();
		System.out.print("n:"); int n=sca.nextInt();
		
		System.out.print("x                               ="); printBit(x);
		System.out.print("\nset(x,pos,n)                  =");printBit(setN(x,pos,n));
		System.out.print("\nreset(x,pos,n)                =");printBit(resetN(x,pos,n));
		System.out.print("\ninverse(x,pos)                =");printBit(inverseN(x, pos,n));
		System.out.println();
	}

}
