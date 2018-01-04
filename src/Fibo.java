import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
            Thread w1 = new Thread();
            (new java.lang.Thread(w1)).start();

    }
}

class Thread extends java.lang.Thread {
    public void run(){
        int x = 1, y = 1;
        int temp;
        System.out.print("Który n-ty liczbę Fibonacciego wyświetlić? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; ++i) {
            temp = x;
            x = y;
            y += temp;
        }

        System.out.println(Integer.toString(n) + ". liczba Fibonacciego to :" +
                Integer.toString(y));
    }
}