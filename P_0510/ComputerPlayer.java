package P_0510;

import java.util.Random;

public class ComputerPlayer extends Player {
private static Random rand;
	
	static {
		rand=new Random();
	}

	@Override
	public int nextHand() {
	return rand.nextInt(3);
	
	}
	

}
