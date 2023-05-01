package P_0501;

import java.util.Scanner;

public class Study01 {
	
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("NO.%d %s %3dcm %3dkg\n",i,a[i].getName(),a[i].getHeight(),a[i].getWeight());
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int n;
		
		Human[] p= {
				new Human("철수",170,70),
				new Human("길동",160,59)
		};
		
		System.out.println("배열 q의 요소수:");
		n=sca.nextInt();
		
		Human[] q=new Human[n];
		for (int i = 0; i < q.length; i++) {
			System.out.println("q["+i+"]");
			System.out.print("이름"); String name=sca.next();
			System.out.print("신장"); int height=sca.nextInt();
			System.out.print("체중"); int weight=sca.nextInt();
			q[i]=new Human(name,height,weight);
		}
		
		Human[][] x= {
				{new Human("김철수",175,52),new Human("김영희",169,60)},
				{new Human("홍길동",178,70),new Human("이철수",172,61)},
				{new Human("이영희",168,59),new Human("김길동",165,59)}	
		};
		System.out.print("배열y의 행수:");
		n=sca.nextInt();
		
		Human[][] y=new Human[n][];
		
		for (int i = 0; i < y.length; i++) {
			System.out.println("y["+i+"]의 열수 ");
			n=sca.nextInt();
			y[i]=new Human[n];
			for (int j = 0; j < y[i].length; j++) {
				System.out.println("y["+i+"]["+j+"]");
				System.out.print("이름"); String name=sca.next();
				System.out.print("신장"); int height=sca.nextInt();
				System.out.print("체중"); int weight=sca.nextInt();	
			y[i][j]=new Human(name,height,weight);
			}
		}
		
		System.out.println("배열p:");
		printHumanArray(p);
		
		System.out.println("배열q:");
		printHumanArray(q);
		
		System.out.println("배열x");
		for (int j = 0; j < x.length; j++) {
			System.out.printf("%d행\n",j);
			printHumanArray(x[j]);
		}
		System.out.println("배열y");
		for (int j = 0; j < y.length; j++) {
			System.out.printf("%d행\n",j);
			printHumanArray(y[j]);
		
		}
		
	}
}
