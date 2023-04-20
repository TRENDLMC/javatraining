package P_0420;

import java.util.Random;
import java.util.Scanner;

public class Study09 {

	public static void main(String[] args) {
	Random rand=new Random();
	Scanner stdIn=new Scanner(System.in);
	
	System.out.print("요소 수:");
	int n=stdIn.nextInt();
	int[] a=new int[n];
	//배열의갯수입력
	
	for(int i=0; i<n;i++){
		//배열수만큼 실행하라 랑같은말 n을쓰던 a.length를입력하든 노상관
		a[i]=1+rand.nextInt(10);
		//a[0]부터 입력된값까지 0~10의값을 대입해라 
	}
	for(int i=10;i>=1;i--) {
		//9번실행해라 
		for(int j=0;j<n;j++) {
			//j를 입력받은 n번만큼 실행하라
			if(a[j]>=i) {
				//a의[1]의값이i보다크거나 같다면
				System.out.print("* ");
			}else {
				System.out.print(" ");
			}
		}
		
		
	System.out.println();
	}for(int i=0;i<2*n;i++) {
		//n의2배만큼 실행해라 그이유 아래에서 프린트한후 " "공백을줬기떄문에 한개의숫자2자리가배당되기떄문
		System.out.print('-');
	}System.out.println();
	//--------이후 개행을바꿔라
	for(int i=0;i<n; i++) {
		System.out.print(i%10+" ");
		//i%10= 9까지는 그값이 그대로 내려옴
	}
	System.out.println();
	}
}

