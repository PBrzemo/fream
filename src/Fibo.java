import java.util.Scanner;

public class Fibo {
    public static void main() {
            Thread w1 = new Thread();
            (new java.lang.Thread(w1)).start();

    }


}

class Thread extends java.lang.Thread {
    public void run(){
        int x = 1, y = 1;
        int temp;
        System.out.print("Which n-th Fibonacci number to display? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; ++i) {
            temp = x;
            x = y;
            y += temp;
        }

        System.out.println(Integer.toString(n) + ". the Fibonacci number is :" +
                Integer.toString(y));
    }
}