package P0509;

public class Study03 implements Study01{

    @Override
    public void putOff() {
        System.out.println("컴퓨터를 껏습니다");
    }

    @Override
    public void putOn() {
        System.out.println("컴퓨터를 실행했습니다");
        
    }
     public  void reset(){
         System.out.println("컴퓨터를 재시작했습니다");
     }
}
