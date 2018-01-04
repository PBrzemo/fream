
import shapes.ShapeRun;
import url.Img;

import java.util.Scanner;
public class MainMenu {

    public static void main(String[] args) throws Exception {

        System.out.println ( "1) url \n2) Shape \n3) Encryption \n4) Generic \n5) SinCos \n6) Draw \n7) Fibo\n8) User \n9) javadoc\n10) Enum" );
        System.out.println("Select:");
        Scanner in = new Scanner(System.in);


        switch (in.nextInt()) {
            case 1:
                System.out.println("Url");
                Img.main();
                break;
            case 2:
                System.out.println("Shape");
                ShapeRun.main();
                break;
            case 3:
                System.out.println("Encryption");
                Encryption.main();
                break;
            case 4:
                System.out.println("Generic in progres");
                //to do
                break;
            case 5:
                System.out.println("SinCos");
                SinCos.main();
                break;
            case 6:
                System.out.println("Draw");
                Draw.main();
                break;
            case 7:
                System.out.println("Fibo");
                Fibo.main();
                break;
            case 8:
                System.out.println("User in progres");
                //User.main();
                break;
            case 9:
                System.out.println("javadoc");
                //to do
                break;
            case 10:
                System.out.println("Enum");
                EnumSeason.main();
                break;
            default:
                System.err.println("Error");
                break;
        }
    }
}