package Threading;


public class Basic extends Thread{
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.print(i);
        }
    }

    static void main(String[] args) {
        Basic b = new Basic();
        b.start();
        b.run();
    }
}
