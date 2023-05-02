package P_0502;

public class Study03 {
	static int counter=0;
	private static int step=1;
	private int id;

	
	public Study03() {
		id=counter+=step;
	}
	public static int getStep() {
		return step;
	}
	public int getId() {
		return id;
	}
	
	public static int setStep(int s) {
		step =(s>=1)?s:1;
		return step;
	}
	public static int getMaxId() {
		return counter;
	}

}
