package OOPS;

public class BasicClass {
    String studentname = "Johnson";
    int reg = 7307;

    // Default constructor
    BasicClass() {
        System.out.println("constructor called");
    }

    // Parameterized Constructor
    BasicClass(String studentname) {
        this.studentname = studentname;
    }

    BasicClass(BasicClass obj) {
        this.studentname = obj.studentname;
    }

    void display() {
        System.out.println(studentname + " " + reg);
    }

    static void main(String[] args) {
        BasicClass bc = new BasicClass();
//        bc.display(bc.name, bc.reg);
        bc.display();
        BasicClass bc2 = new BasicClass("RK");
        bc2.display();
        BasicClass bc3 = new BasicClass(bc2);
        bc3.display();
    }
}
