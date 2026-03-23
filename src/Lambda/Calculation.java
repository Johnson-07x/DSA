package Lambda;

public class Calculation {
    static void main(String[] args) {

        // Use 'Operation' as the type, not 'int'
        Operation divide = (int a, int b) -> { return b == 0 ? 0 : a / b;};

        // To run the code, call the method defined in the interface
        divide.Divide(10, 2);
    }
}
