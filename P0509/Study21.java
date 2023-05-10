package P0509;

public class Study21 {
    public static void main(String[] args) {
        Study20 a = new Study20();
        Study18 b = new Study20();
        Study19 c = new Study20();

        System.out.println("DVDplayer형 변수a");
        a.play();
        a.stop();
        a.slow();
        System.out.println("player형 변수b");
        b.play();
        b.stop();
        System.out.println("Explayer형 변수c");
        c.play();
        c.stop();
        c.slow();


    }
}