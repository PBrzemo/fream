import java.util.Scanner;

public class SinCos {

    public static void main() {

        System.out.println("Podaj wartość dla sinusa");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double sin = Math.sin(x);
        //System.out.println(sin);
        long round = Math.round(sin);
        System.out.println(round);
        System.out.println("__________________________________");

        System.out.println("Podaj wartość dla cosinusa");
        Scanner sc1 = new Scanner(System.in);
        double y = sc1.nextDouble();
        double cos = Math.sin(y);
        //System.out.println(cos);
        long round1 = Math.round(cos);
        System.out.println(round1);
        System.out.println("__________________________________");
    }
}



