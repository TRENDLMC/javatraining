package P_0504;

abstract public class Study23 {
	private String name;
	public Study23(String name) {this.name=name;}
	public abstract void bark();
	public String getName() {return name;}
	public abstract String toString();
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}

		
	

}
