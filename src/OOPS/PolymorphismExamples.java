package OOPS;

class Chat {
    public void chat() {
        System.out.println("Default Chat");
    }
}

class Instagram extends Chat {
    public void chat() {
        System.out.println("Instagram here");
    }
}

class FaceBook extends Chat {
    public void chat() {
        System.out.println("Facebook gone meta");
    }
}

public class PolymorphismExamples {
    static void main(String[] args) {
        Chat in = new Instagram();
        in.chat();
        FaceBook fb = new FaceBook();
        fb.chat();
    }
}
