package P_0504;

public class Study25 extends Study23 {
	private int age;

	public Study25(String name,int age) {
		super(name);
		this.age = age;
	}

	@Override
	public void bark() {
		System.out.println("냐옹!");
		
	}

	@Override
	public String toString() {
		return age+"살의"+getName();
	}
	
	

}
