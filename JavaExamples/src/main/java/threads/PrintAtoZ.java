package threads;

public class PrintAtoZ {

    public static void main(String[] a) {
        Thread1 t1 = new Thread1();
        new Thread(t1).start();

        Thread2 t2 = new Thread2();
        new Thread(t2).start();
    }

}

class Thread1 extends Thread {

    @Override
    public void run() {
        synchronized (Object.class) {
            for(char i='a'; i<='j'; i++) {
                System.out.print(i+" ");
            }
        }
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        synchronized (Object.class) {
            for(char i='k'; i<='z'; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
