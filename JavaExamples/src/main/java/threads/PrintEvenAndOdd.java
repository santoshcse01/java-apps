package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintEvenAndOdd {

    public static void main(String[] a) {
        /*new Thread(new EvenOdd()).start();
        new Thread(new EvenOdd()).start();*/
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(letters.stream().reduce("", (s1, s2) -> s1.concat(s2)));
    }
}

class EvenOdd extends Thread {

    static AtomicInteger s = new AtomicInteger(1);

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
             print(i);
        }
    }

    private synchronized void print(int num) {
        try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        if (num%2 == 0)
            System.out.println("even "+num);
        else System.out.println("odd "+num);
        notifyAll();
    }
}