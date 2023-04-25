package P_0425;

import java.util.Scanner;

public class Study10 {
	static void printBits(int x) {
		for(int i=31;i>=0;i--) {
			System.out.print(((x>>>i&1)==1)?'1':'0');
		}
	}
	
	static int rRotate(int x,int n) {
		if(n<0) {
			return lRotate(x,-n);
		}
		n%=32;
		return(n==0?x:(x>>>n)|(x<<(32-n)));
		//n을 32로 나눳을떄 남는값이 0이라면x로가라 felse이면 두번쨰로가거나세번쨰로가라 
	}
	
	static int lRotate(int x,int n) {
		if(n<0){
			return rRotate(x,-n);
		}n%=32;
		return(n==0?x:(x<<n)|(x>>>(32-n)));
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.println("정수x를 n비트 회전합니다");
		System.out.print("x:"); int x=sca.nextInt();
		System.out.print("n:"); int n=sca.nextInt();
		System.out.print("회전 전=\n"); printBits(x);
		
		System.out.print("\n오른쪽회전=\n");printBits(rRotate(x, n));
		System.out.print("\n왼쪽회전=\n");printBits(lRotate(x, n));
		System.out.println();
	}

}
