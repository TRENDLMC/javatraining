package P_0504;

public class Study21 {
	public static void main(String[] args) {
		Study18[] a=new Study18[2];
		
		a[0]=new Study19("뭉치","치와와");
		a[1]=new Study20("마이클",7);
		
		for (Study18 study18 : a) {
			System.out.print(study18.getName()+"  ");
			study18.bark();
			System.out.println();
		}
				
		
	}

}
