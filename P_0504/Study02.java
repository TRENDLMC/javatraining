package P_0504;

public class Study02 extends Study01{
	

	private double totalMileage;
	
	public Study02(String name,int width,int height,
			int length,double fuel,Day purchaseDay) {
		super(name,width,height,length,fuel,purchaseDay);
		totalMileage=0.0;
	}

	public double getTotalMileage() {
		return totalMileage;
	}
	
	@Override
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
