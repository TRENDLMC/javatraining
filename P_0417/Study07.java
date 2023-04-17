package P_0417;

import java.util.Scanner;

public class Study07 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
	System.out.println("몇cm부터:");
	int hMin=stdIn.nextInt();
	//조건문 최소값입력
	System.out.println("몇cm까지:");
	//조건문 최대값입력
	int hMax=stdIn.nextInt();
	System.out.println("몇cm 단위");
	//증감값입력
	int step=stdIn.nextInt();
	System.out.println("신장표준체중");
	System.out.println("----------");
	for(int i=hMin;i<=hMax;i+=step)
		// i가 최소값 150대입 i가 hmax보다 작거나 가을떄까지반복 i의증값같은5 
	{System.out.println(i+" "+0.9*(i-100));
	//i값 최솟값과 최대값사이의5의증감값 띄고 (i값-100)선계산후*0.9 후출력 
	}

}
}
