package P_0504;

import java.util.Scanner;

public class Study15 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.print("도형의 개수:");
		int no=sca.nextInt();
		Study09[] p=new Study09[no];
		
		for (int i = 0; i < no; i++) {
			int type;
			do {
				System.out.print((i+1)+"번의도형의종류(1...점/2...수평선"+"3...수직선/4...사격형):");
				type=sca.nextInt();
			}while(type<1||type>4);
			
			switch(type) {
			case 1: p[i]=new Study10();break;
			case 2:
			case 3: System.out.print("길이는:");
			int len =sca.nextInt();
			p[i]=(type==2)?new Study12(len):new Study13(len);break;
			case 4:System.out.print("너비:");
					int width=sca.nextInt();
					System.out.print("높이");
					int height=sca.nextInt();
					p[i]=new Study14(width,height);break;
			}
		}
		
		for(Study09 s:p) {
			s.print();
			System.out.println();
		}
	}

}
