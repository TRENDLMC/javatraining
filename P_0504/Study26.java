package P_0504;

import java.util.Iterator;

public class Study26 {
	public static void main(String[] args) {
		
	
	Study23[] a=new Study23[2];
	
	a[0]=new Study24("뭉치","치와와");
	a[1]=new Study25("마이클",7);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("a["+i+"]="+a[i]);
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print("a["+i+"]=");
		a[i].introduce();
	}


	}
}
