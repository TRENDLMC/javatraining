package P_0420;

public class Study08 {
	public static void main(String[] args) {
		double[] a= new double[5];	
		for(int i=0;i<a.length;i++) {
			//5번실행시켜라 라는말과동일 a.length=5 i의 값은 0,1,2,3,4 총5개 
			a[i]=(i+1)*1.1;
			//변수a의배열i에다가 i+1를한후곱하기1.1을하고 대입해라 
		}
		for(int i=0; i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
			//대입한값출력문 
		}
		
	}

}
