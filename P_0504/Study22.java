package P_0504;

public class Study22 {
	public static void main(String[] args) {
		Study18[] a=new Study18[2];
		
		a[0]=new Study19("뭉치","치와와");
		a[1]=new Study20("마이클",7);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].getName()+"  ");
			a[i].bark();
			System.out.println();
		}
	}

}
