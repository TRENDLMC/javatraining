package P_0502;

public class Study01 {
	static int counter=0;
	private int id;
	public Study01() {
	 id= ++counter;
	}
	public int getId() {
		return id;
	}
	
	public static int getMaxId() {
		return counter;
	}
	
	
	
	

}
