package P0509;

public class Study04 {
    public static void main(String[] args) {
            Study01[] a=new Study01[2];
            a[0]=new Study02();
            a[1]=new Study03();

            for (int i=0;i<a.length;i++){
                a[i].putOn();
            }

            for (int i=0;i<a.length;i++){
            a[i].putOff();
            }

    }
}
