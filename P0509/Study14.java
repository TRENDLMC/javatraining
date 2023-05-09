package P0509;

public class Study14 extends Study13 implements Study05{
    private int skin;
    
    public Study14(String name,String masterName,int skin){
        super(name,masterName);
        this.skin=skin;
    }

    @Override
    public void changeSkin(int skin) {
        this.skin=skin;
    }
    public void printSkin(){
        switch (skin){
            case BLACK:
                System.out.print("검정");break;
            case RED:
                System.out.print("빨강");break;
            case GREEN:
                System.out.print("초록");break;
            case BLUE:
                System.out.print("파랑");break;
            case YELLOW:
                System.out.print("노랑");break;
        }
    }
}
