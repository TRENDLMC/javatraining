package P0509;

public class Study11 {
    public static void main(String[] args) {
        Study08[] a={new Study10(2,5) , new Study09(2,5) };
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]의면적="+a[i].getArea());
        }
    }
}
