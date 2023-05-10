package P0509;

public class Study02 implements Study01 {

        int volume=0;

    @Override
    public void putOn() {
        System.out.println("헤드폰을 착용했습니다");
    }

    @Override
    public void putOff() {
        System.out.println("헤드폰을 벗었습니다");
    }


    public  void setVolume(int volume) {
        this.volume=volume;
        System.out.println("볼륨을"+volume+"로 변경했습니다");
    }
}
