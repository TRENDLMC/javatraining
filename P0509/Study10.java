package P0509;

public class Study10 extends Shape implements Study08{
    private int width;
    private int height;

    public Study10(int width,int height){
        this.width=width;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Study10(width"+width+",height:"+height+")";
    }

    @Override
    public void draw() {
        for (int i = 1; i <=height ; i++) {
            for (int j = 1; j <=height-i ; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= width; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

    @Override
    public int getArea() {
        return width*height;
    }
}
