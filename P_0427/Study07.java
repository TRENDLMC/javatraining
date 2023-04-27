package P_0427;

import java.util.Scanner;

public class Study07 {
	
	static int min(int a,int b) {
		return a<b?a:b;
	}
	
	static int min(int a,int b, int c) {
		int min=a;
		if(b<min) {
			min=b;
		}if(c<min) {
			min=c;
		}return min;
	}
	
	static int min(int[] a) {
		int min =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}return min;
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.print("x의값"); int x=sca.nextInt();
		System.out.print("y의값"); int y=sca.nextInt();
		System.out.print("z의값"); int z=sca.nextInt();
		System.out.print("배열 a의요소수:");
		int num=sca.nextInt();
		int[] a=new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]:");
			a[i]=sca.nextInt();
		}
		
		System.out.println("x,y의 최솟값은"+min(x,y)+"입니다");
		System.out.println("x,y,z의 최솟값은"+min(x,y,z)+"입니다");
		System.out.println("a의배열의  최솟값은"+min(a)+"입니다");
	}

}
