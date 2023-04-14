package P_0414;

import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	System.out.println("몇개를 표시할까요");
	int n=stdIn.nextInt();
	
	if(n>0) {
		int i=0;
		while(i<n) { // i가 n보다 작다면 
			if(i%2==0) { // i를 2로나눠라 그값이 0과같으면 true 아니면 else로가라
				System.out.println('*');//짝수면호출
			}else
				System.out.println('+');//홀수표현
			i++;//i의 값증가 다시 while문으로 감 
		}
		System.out.println();
	}
	}

}
