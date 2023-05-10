package P0509;

public abstract class Shape {
    /*
     * 도형 정보를 나타내는 문자열을 반환하는 추상메서드이다
     * Study09 클래스에서 파생되는 클래스에서 이메서드를 구현한다
     * 이메서드는 jva.langobject클래스의 메서드를 추상메서드로
     * 오버라이드한 메서드이다
     */
    public abstract String toString();
    /*
     * draw메서드는 도형을 그리기 위한 추상메서드이다.
     * Study09클래스에서 파생되는 클래스에서 이메서드를 구현한다
     */
    public abstract void draw();
    /*
     * print 메서드는 도형 정보의 표시하고 도형자체를 그린다
     * 구체적으로는 다음 두단계를 따른다.
     * step 1. to String 메서드가 반호나하는 문자열을 표시하고 줄바꿈
     * step 2. draw메서드를 호출해서 도형을 그림
     */

    public void print() {
        System.out.println(toString());
        draw();
    }
}
