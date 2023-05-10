package P0509;

public class Study06 implements Study05 {
    int skin;

    Study06(){
        this.skin=BLACK;
    }
    Study06(int skin){
        this.skin=skin;
    }

    @Override
    public void changeSkin(int skin) {
        this.skin=skin;
    }

    public int getSkin() {
        return skin;
    }
    public String getSkinString(){
        switch (skin) {
            case BLACK: return "BLACK";
            case RED: return "RED";
            case GREEN: return "GREEN";
            case BLUE: return "BLUE";
            case YELLOW: return "YELLOW";
        }
        return "";
    }
}
