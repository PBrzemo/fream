import java.util.Random;
/**
 * @author {PBrzemo}
 *
 *
 */
public class Draw {

    public static void main() {

        Random r = new Random();
        int[] x = new int[10];
        for (int i = 0;  i<10; i++) {
            x[i] = r.nextInt(100);
            System.out.println(x[i]);
        }

    }
}
