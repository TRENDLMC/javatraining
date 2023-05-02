package P_0502;

import java.util.Scanner;

public class Study08 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("x의값");int x=sca.nextInt();
		System.out.print("y의값");int y=sca.nextInt();
		System.out.print("z의값");int z=sca.nextInt();
		System.out.print("배열a의 요소수:");int num=sca.nextInt();
		int[] a=new int[num];
		
		for (int i = 0; i <num; i++) {
			System.out.print("a["+i+"]:");
			a[i]=sca.nextInt();
		}
		
		System.out.printf("x,y의 최소값은%d입니다\n",Study07.min(x,y));
		System.out.printf("x,y의 최대값은%d입니다\n",Study07.max(x,y));
		System.out.printf("x,y,z의 최소값은%d입니다\n",Study07.min(x,y,z));
		System.out.printf("x,y,z의 최대값은%d입니다\n",Study07.max(x,y,z));
		System.out.printf("a배열의 최솟값은 %d입니다\n",Study07.min(a));
		
		int xmin[]=Study07.minIndexArray(a);
		System.out.print("인덱스는{");
		for (int i = 0; i < xmin.length; i++) {
			System.out.print(xmin[i]+" ");
		} System.out.println("}입니다.");
		System.out.printf("배열a의 최댓값은 %d입니다\n",Study07.max(a));
		int xmax[]=Study07.maxIndexArray(a);
		System.out.print("인덱스는{");
		for (int i = 0; i < xmax.length; i++) {
			System.out.print(xmax[i]+" ");
		}System.out.println("}입니다.");
		
	}
}
