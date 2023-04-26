package P_0426;

import java.util.Scanner;

public class Study04 {
static int minOf(int[] a) {
	int min=a[0];
	for(int i=1; i<a.length;i++) {
		//1차원배열의 최소값을 구하는 메소드 
		if(a[i]<min) {
			min=a[i];
		}
	}return min;
	}
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	System.out.print("사람 수는:");
	int num =sca.nextInt();
	
	int[] geight=new int[num];
	int[] weight=new int[num];
	
	System.out.println(num+"명의 신장과 체중을 입력하자");
	for(int i=0; i<num;i++) {
		System.out.print((i+1)+"번의신장");
		geight[i]=sca.nextInt();
		System.out.print((i+1)+"번의신장");
		weight[i]=sca.nextInt();
	}
	
	System.out.println("가장키가 작은사람의 신장:"+minOf(geight)+"cm");
	System.out.println("가장키가 마른사람의 체중:"+minOf(weight)+"kg");
}
}
