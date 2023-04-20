package P_0420;

public class Study07 {	
	public static void main(String[] args) {
		int[] a=new int[5];
		
		for(int i=0; i<a.length;i++) {
			//int 타입 변수i를선언후 1로초기화 i가 a.length(a변수의배열의길이여기선 5) 증감문 i에 1을더해라
			a[i]=5-i;
			//변수 a 배열의 i에 5-i의 값을 대입해라 
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
			//출력문
		}
	}

}
