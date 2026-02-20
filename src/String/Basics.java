package String;

public class Basics {
    static void main(String[] args) {
        String s = "vignesh";
        String s2 = new String("vignesh");
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s.getClass().getSimpleName());
        System.out.println(s2.getClass().getSimpleName());
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s.equals(s2 ));
    }
}
