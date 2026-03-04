package Threading;

// MyThread using "Thread Class"
public class MyThread extends Thread{
    String name;
    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    static void main(String[] args) {
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");
        MyThread t3 = new MyThread("Thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}
