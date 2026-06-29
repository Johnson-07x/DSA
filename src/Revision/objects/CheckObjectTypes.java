package Revision.objects;

public class CheckObjectTypes {
    public static void main(String[] args) {
        Object[] arr = {1, true, 'a', "Helo", 12, 43.5 ,52};
        for (Object o : arr) {
            if (o instanceof Double) {
                System.out.println(o);
            }
        }
    }
}
