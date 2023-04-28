package P_0428;

import java.util.Scanner;

public class Study09 {
	
	public static void main(String[] args) {
		//배열로 메소드에 값을 넣어서 한번에 여러개의 값을 받는 메인메소드 
		
		Scanner sca=new Scanner(System.in);
		
		System.out.print("좌표는 몇개:");int n= sca.nextInt();
		
		Study06[] a= new Study06[n];
		
		for(int i=0; i<a.length;i++) {
			a[i]=new Study06(5.5+i,7.7+i);
		}
		for(int i=0;i<a.length;i++) {
			System.out.printf("a[%d]=(%.1f,%.1f)\n" ,i,a[i].getX()
					,a[i].getY());
		}
	}

}
