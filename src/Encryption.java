import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Scanner;


public class Encryption {



    public static void main() throws Exception {

        KeyGenerator keygenerator = KeyGenerator.getInstance("AES");// można inne typy algorytmów blowifsh des
        SecretKey secretkey = keygenerator.generateKey();
        Cipher cipher = Cipher.getInstance("AES");// można inne typy algorytmów blowifsh des
        cipher.init(Cipher.ENCRYPT_MODE, secretkey);

        System.out.println("Text to encrypt :");
        Scanner inputText = new Scanner(System.in);
        String n = inputText.next();
        byte[] encrypted = cipher.doFinal(n.getBytes());
        System.out.println("-----------------------------------");
        cipher.init(Cipher.DECRYPT_MODE, secretkey);
        byte[] decrypted = cipher.doFinal(encrypted);
        // to do
        System.out.println("encrypted text : "+ new String(encrypted) + "\n" + "decrypted: "+ new String(decrypted));

    }

}