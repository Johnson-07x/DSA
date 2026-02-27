package OOPS;

/*  PaymentProcessor is a contract interface
    Any class that implements payment processor must be defined.
    This gives extensibility standardisation and flexibility
*/
interface PaymentProcessor {
    void processPayment(double amount);
}

/*  Concrete Implementation
    This class provides it's own implementation of the contract
    It defines how creditcard/upi payment works
    Runtime polymorphism
*/
class CreditCardPayment implements PaymentProcessor { // Third Executes
    public void processPayment(double amount) {
        System.out.println("Validating Credit card...");
        System.out.println(amount + " Debited successfully");
    }
}

class UpiPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Validating UPI Payment...");
        System.out.println(amount + " Debited successfully");
    }
}

class PaymentService {
    /*  Dependency Injection:
        Payment Service Does'nt create object, it receives from outside
        We call it as constructor Dependency Injection
        Payment
    */
    private final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) { // Second Executes
        paymentProcessor.processPayment(amount);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // leftSide -> interface type = right -> implementation object
        PaymentProcessor creditcard = new CreditCardPayment();
        PaymentService creditcardService = new PaymentService(creditcard);

        PaymentProcessor upi = new UpiPayment();
        PaymentService upiService = new PaymentService(upi);

        creditcardService.makePayment(250);  // First executes
        upiService.makePayment(450);
    }
}