package P0509;

public class Study09 extends Shape implements Study08 {

    private int width;
    private int heigth;

   public Study09(int width,int heigth){
        this.width=width;
        this.heigth=heigth;
    }

    @Override
    public String toString() {
        return "Rectangle(width:"+width+",height:"+heigth+")";
    }

    public void draw(){
        for (int i=0; i<=heigth;i++){
            for (int j=0; j<=width;i++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    @Override
    public int getArea() {
        return width*heigth;
    }
}
