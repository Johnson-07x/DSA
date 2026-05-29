package Revision;

interface Bike {
    void sound();
}

interface Pulsar extends Bike {
    void sound();
}

interface BMW extends Bike {
    void sound();
}

class Cycle implements Pulsar, BMW {
    public void sound() {
        System.out.println("Cycle is Ding Dong");
    }
}

public class HybridInheritance {
    static void main(String[] args) {
        Cycle c = new Cycle();
        c.sound();
    }
}
