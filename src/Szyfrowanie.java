import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Scanner;


public class Szyfrowanie{



    public static void main(String[] args) throws Exception {

        KeyGenerator keygenerator = KeyGenerator.getInstance("Blowfish");
        SecretKey secretkey = keygenerator.generateKey();
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, secretkey);

        System.out.println("tekst do zaszyfrowania :");
        Scanner inputText = new Scanner(System.in);
        String n = inputText.next();
        byte[] encrypted = cipher.doFinal(n.getBytes());
        System.out.println("-----------------------------------");
        cipher.init(Cipher.DECRYPT_MODE, secretkey);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("tekst zaszyfrowany : "+ new String(encrypted) + "\n" + "Odszyfrowany: "+ new String(decrypted));

    }

}