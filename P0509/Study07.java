package P0509;

public class Study07 {
    public static void main(String[] args) {
        Study06 x=new Study06();
        Study06 y=new Study06(Study05.GREEN);


        x.changeSkin(Study05.YELLOW);
        System.out.println("x의 스킨은"+x.getSkinString()+"입니다");
        System.out.println("y의 스킨은"+y.getSkinString()+"입니다");

    }
}
