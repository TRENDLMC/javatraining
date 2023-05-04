package P_0504;

public class Study24 extends Study23 {
	private String type;
	public Study24(String name,String type) {
		super(name);this.type=type;
	}
	public void bark() {System.out.println("멍멍");}
	public String toString() {
		return type+"의"+getName();
	}
	
}
