package P_0508;

import java.util.Random;

public class Study09 extends Study07{
	
	private static Random rand;
	
	static {
		rand=new Random();
	}

	@Override
	public int nextHand() {
	return rand.nextInt(3);
	
	}
	


}
