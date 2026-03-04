package Threading;

class Counter {
    int count = 0;

    // use 👇 this for Synchronized thread -> executes orderly (not random)
//    Synchronized void incrementCounter() {
//        count++;
//    }

     public void incrementCounter() {
        count++;
    }
}

public class ProjectGame extends Thread{
    Counter c;
    String team;
    ProjectGame(String team, Counter c) {
        this.team = team;
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
//            System.out.println(team);
//            System.out.println("Frontend");
//            System.out.println("Backend");
//            System.out.println("FullStack");
//            System.out.println("DB");
//            System.out.println();
            c.incrementCounter();
        }
    }

    static void main(String[] args) {
        Counter c = new Counter();
        ProjectGame t1 = new ProjectGame("Team A",c);
        ProjectGame t2 = new ProjectGame("Team B", c);

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(c.count);
    }
}
