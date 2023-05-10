package P0509;

public class Study20 implements Study19 {

    @Override
    public void play() {
        System.out.println("DVD재생시작!");
    }

    @Override
    public void stop() {
        System.out.println("DVD재생종료!");
    }

    @Override
    public void slow() {
        System.out.println("DVD느린 재생시작!");
    }
}
