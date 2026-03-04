package Threading;

public class MyThreadUsingRunnable implements Runnable{
    String name;
    MyThreadUsingRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    static void main(String[] args) {
        Thread t1 = new Thread(new MyThreadUsingRunnable("Thread1"));
        Thread t2 = new Thread(new MyThreadUsingRunnable("Thread2"));
        Thread t3 = new Thread(new MyThreadUsingRunnable("Thread3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
