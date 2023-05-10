package P0509;

public class Study17 {
    public static void main(String[] args) {
        Study16 hmd=new Study16();
        hmd.putOn();
        hmd.putOff();
        hmd.changeSkin(Study05.YELLOW);
        hmd.putSkin();

        Study01 w=hmd;
        w.putOn();
        w.putOff();

        Study05 s=hmd;
        s.changeSkin(Study05.BLACK);

        hmd.putSkin();
    }
}
