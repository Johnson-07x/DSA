package OOPS;

interface Notification {
    void send (String message);
}

class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Notification from Email" + " " + message);
    }
}

class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Notification from SMS" + " " + message);
    }
}

class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Notification from PUSH" + " " + message);
    }
}

public class NotificationSystem {
    static void main(String[] args) {
        Notification n = new EmailNotification();
        n.send("Hello");
        n = new  SMSNotification();
        n.send("Hello");
        n = new  PushNotification();
        n.send("Hello");
    }
}
