package P_0428;

import java.util.Scanner;

public class Study08 {
	
	static boolean compCoordinate(Study06 c1, Study06 c2){
	return c1.getX()==c2.getX()&&c1.getY()==c2.getY();
	// && and || or  c1의좌표값과c2의좌표값x가 같고 y의좌표값도 같을떄 tuer를 반환
	}
	
	public static void main(String[] args) {
	 Scanner sca=new Scanner(System.in);
	 
	 double x,y;
	 System.out.println("좌표 p를 입력하세요");
	 System.out.print("좌표 x:"); x=sca.nextDouble();
	 System.out.print("좌표 y:"); y=sca.nextDouble();
	 
	 Study06 p=new Study06(x, y);
	 
	 System.out.println("좌표 p를 입력하세요");
	 System.out.print("좌표 x:"); x=sca.nextDouble();
	 System.out.print("좌표 y:"); y=sca.nextDouble();
	 Study06 q=new Study06(x, y);
	 
	 System.out.println((p==q)?"p==q 입니다":"p!=입니다");
	 //c1과 c2를 비굔  3항연산자 flase면 뒤에꺼 ture 면 앞에꺼
	 System.out.println((p.getX()==q.getX()&&p.getY()==q.getY()?"p와q가 같습니다":"p와q가 다릅니다."));
	 //이거랑 위에 메소드랑 똑같음 그걸 길게 늘려써 놓은것
	 
	 System.out.println(compCoordinate(p, q)?"p와q가 같습니다":"p와q가 다릅니다");
	 //c1과 c2를 대입  3항연산자 flase면 뒤에꺼 ture 면 앞에꺼
	}
	
	
	

}
