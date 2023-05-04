package P_0504;

public class Study04 extends Study01{

	

	private double totalMileage;
	
	public Study04() {
	}

	public double getTotalMileage() {
		return totalMileage;
	}
	
	
	public void putSpec() {
		super.putSpec();
		System.out.printf("총주행거리:%.2fkm\n",totalMileage);
	}
	
	public boolean move(double dx,double dy) {
		double dist=Math.sqrt(dx*dx+dy*dy);
		if(!super.move(dx, dy)) {
			return false;
		}else {
			totalMileage+=dist;
			return true;
		}
		
	}
	
	

}
