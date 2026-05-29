package Revision;

abstract class Payment {
    abstract void gPay();
    abstract void phonePay();
    abstract void paytm();
    abstract void famPay(int balance);

    void sayHelo() {
        System.out.println("Say Helo");
    }
}

class Gateway extends Payment {

    void gPay() {
        System.out.println("Received Amount on gPay");
    }

    void phonePay() {
        System.out.println("Received Amount on phonePay");
    }

    void paytm() {
        System.out.println("Received Amount on paytm");
    }

    void famPay(int balance) {
        System.out.println("Received Amount on famPay, Balance: " + balance);
    }

    void helo() {
        System.out.println("Hello World");
    }

    @Override
    void sayHelo() {
        System.out.println("HI");
        super.sayHelo();
    }
}

public class Abstraction {
    static void main(String[] args) {
        Gateway g = new Gateway();
        g.gPay();
        g.phonePay();
        g.paytm();
        g.famPay(1000);
        g.helo();
        g.sayHelo();
    }
}
