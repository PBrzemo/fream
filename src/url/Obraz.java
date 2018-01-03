package url;

import java.io.IOException;
import java.util.Scanner;

public class Obraz {


    public static void main(String[] args) throws IOException {

        System.out.println("podaj url obrazka:");
        Scanner sc = new Scanner(System.in);
        String imgUrl = sc.next();
        Singleton singleton = Singleton.INSTANCE;
        String saveImg = "o.jpg";

        singleton.saveImage(imgUrl, saveImg);



    }
}
