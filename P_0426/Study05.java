package P_0426;

import java.util.Scanner;

public class Study05 {
	
	static int linearSearch(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			//0부터 올라가면서 구하는 메소드
			if(a[i]==key) {
				//a의 배열i번쨰가 key(찾는값)과같으면 i를 리턴
				return i;
			}
		}return -1;
		//만약 i번실행했을떄 없으면 -1을리턴
		
	}

	static int linearSearchR(int[] a, int key) {
		for(int i=a.length-1;i>=0;i--) {
			//i를 a배열의 최대값을 넣어줌
			if(a[i]==key) {
				return i;
			}
		}return -1;
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.print("요소수:");
		int num=sca.nextInt();
		int []x=new int[num];
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i]=sca.nextInt();
		}
		
		System.out.print("찾는값:");
		int ky=sca.nextInt();
		
		int idxsTop=linearSearch(x, ky);
		//찻는값을 아래에서 부터위로 검색
		int idxsBtm=linearSearchR(x, ky);
		// 찾는값을 위에서 아래로 검색
		
		if(idxsTop==-1) {
			//리턴값이 -1일경우 해당값이 존재하지않음을 출력
			System.out.println("해당값은 존재하지 않습니다");
		}else if(idxsTop== idxsBtm) {
			System.out.println("해당값은 x["+idxsTop+"]에 있습니다");
			// top와 btm의 리턴i가 같을떄 출력  idxsBtm 해도 무관
		}else {
			System.out.println("해당값의 요소가 여러개 존재합니다");
			System.out.println("가장앞에 위치한값은 x["+idxsTop+"]에있습니다");
			System.out.println("가장뒤에 위치한값은 x["+idxsBtm+"]에있습니다");
			//두개의 값이있을떄 top와 btm을 각각 출력 3개면? 가운데껀뻄 
			}			
	}
}
