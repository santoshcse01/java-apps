package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    static AtomicInteger s = new AtomicInteger(1);

    public static void main(String a[]) {

        for(int i=0;i<10;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(s.incrementAndGet());
                }
            }).start();
        }
    }

}
