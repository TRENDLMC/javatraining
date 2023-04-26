package P_0426;

import java.util.Scanner;

public class Study01 {
	
	static void printBit(int x) {
		for(int i=31;i>=0;i--) {
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
	}

	static int set(int x,int pos) {
		return x|(1<<pos);
	}
	
	static int reset(int x,int pos) {
		return x&~(1<<pos);
	}
	
	static int inverse(int x, int pos) {
		return x ^ (1<<pos);
	}
	
	
	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		
		System.out.println("정수의 pos번쨰 비트를 변경합니다");
		System.out.print("x:"); int x=sca.nextInt();
		System.out.print("pos:"); int pos=sca.nextInt();
		
		System.out.print("x                               ="); printBit(x);
		System.out.print("\nset(x,pos)                      =");printBit(set(x,pos));
		System.out.print("\nreset(x,pos)                    =");printBit(reset(x,pos));
		System.out.print("\ninverse(x,pos)                  =");printBit(inverse(x, pos));
		System.out.println();
	}

}
