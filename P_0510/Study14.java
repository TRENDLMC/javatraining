package P_0510;

public class Study14 {
	public static void main(String[] args) {
		double sum=0.0;
		for (String s : args) {
			sum +=Double.parseDouble(s);
		}
		System.out.println("합게는 "+sum+"입니다");
	}

}
