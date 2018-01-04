package url;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Img {


    public static void main() throws IOException {

        System.out.println("podaj url obrazka:");
        Scanner sc = new Scanner(System.in);
        String imgUrl = sc.nextLine();
        Singleton singleton = Singleton.INSTANCE;
        String forServerStatus = imgUrl;
        URL url;
        url = new URL(forServerStatus);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        singleton.ServerStatus(con);

        String saveImg = "o.jpg";
        singleton.saveImage(imgUrl, saveImg);


    }
}
