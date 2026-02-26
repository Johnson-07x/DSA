package OOPS;

class V1 {
    static void post() {
        System.out.println("post images");
        System.out.println("Likes, Shares, Comments");
    }
}

class V2 extends V1 {
    static void reel() {
        System.out.println("Post Videos");
        System.out.println("Post Musics");
    }
}

class V3 extends V2 {
    static void connect() {
        System.out.println("Follow");
        System.out.println("Direct Message");
    }
}

class V4 extends V3{
    static void streaming() {
        System.out.println("Make Live");
        System.out.println("Direct Message");
    }
}

public class Inheritance {
     static void main(String[] args) {
        V4 v4 = new V4();
        v4.post();
        v4.reel();
        v4.connect();
        v4.streaming();
    }
}
