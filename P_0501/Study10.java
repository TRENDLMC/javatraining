package P_0501;

public class Study10 {
	public static void main(String[] args) {
		
		Study09 taejo=new Study09(new Study02(1392,8,5),new Study02(1398,10,14));
		Study09 jeongjong=new Study09(new Study02(1398,10,14),new Study02(1400,11,28));
		Study09 taejong=new Study09(new Study02(1400,11,28),new Study02(1418,9,9));
		Study09 sejong=new Study09(new Study02(1418,9,9),new Study02(1450,3,30));
		System.out.println("태조="+taejo);
		System.out.println("정종="+jeongjong);
		System.out.println("태종="+taejong);
		System.out.println("세종="+sejong);
	}
}
