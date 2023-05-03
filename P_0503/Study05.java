import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;


public class Study05 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        out.print("실 수:");
        double x=sca.nextDouble();

        out.println("절대값:"+abs(x));
        out.println("제곱근"+ sqrt(x));
        out.println("넓이:"+PI*x*x);

    }
}
