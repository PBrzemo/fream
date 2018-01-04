package url;
import javax.net.ssl.HttpsURLConnection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


public enum Singleton {
    INSTANCE;


    public static void saveImage(String imgUrl, String saveImg) throws IOException {
        URL url = new URL(imgUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(saveImg);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }


    public void ServerStatus(HttpsURLConnection con){

        if(con!=null){

            try {
                System.out.println("---------------------------------------------");
                System.out.println("Server response code: " + con.getResponseCode());
                System.out.println("---------------------------------------------");

                } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}