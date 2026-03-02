package Exception;

public class ExceptionChaining {
    static void main(String[] args) {
        try {
            int x = 10;
            System.out.println(x / 0);
        } catch (Exception e) {
            throw new RuntimeException("Exception message", e);
        }
    }
}
