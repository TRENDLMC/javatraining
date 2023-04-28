package P_0428;

import java.util.Scanner;

public class Study11 {
	
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 
	
	 System.out.println("좌표 p를 입력하세요");
	 System.out.print("좌표 x:");double x=sca.nextDouble();
	 System.out.print("좌표 y:");double y=sca.nextDouble();
	 
	 Study10 p=new Study10(x, y);
	 //값을입력후 그값을 변수 p에저장함
	 System.out.println("p="+p);
	 //p의 값을 매개변수대신 함수로 넣어서 생성자호출하고 저장함
	 Study10 q=new Study10(p);
	 
	 
	 System.out.println("q와p를 동일 좌표로 만들었습니다");
	 System.out.println("q="+q);
	 //복사
	 
	 if(p.equalTo(q)) {
		 //equlaTO에서 값을 비교후 false과 ture을 반환
		 System.out.println("p와q가 같습니다");
	 }else {
		 System.out.println("p와q가 다릅니다");
	 }
	 
	 Study10 c1=new Study10();
	 Study10 c2=new Study10(1.1,2.2);
	 //c1의에 값을 대입 
	 System.out.println("c1="+c1);
	 System.out.println("c2="+c2);
	 
	 Study10[] a=new Study10[3];
	 //함수타입에 배열 a를 선언후 배열을 3으로 선언해줌
	 
	 for(int i=0; i<a.length;i++) {
		 a[i]=new Study10();
		 //기본 초기값인0.0을대입 총 3번대입한다 왜냐 값을 3으로 지정해줬기떄문에
	 }for(int i=0; i<a.length;i++) {
		 //출력문 
		 System.out.println("a["+i+"]="+a[i]);
	 }
	 
		 
	 }
	
	
	

}
