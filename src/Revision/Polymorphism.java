package Revision;

// Method Overriding
class Shape {
    void findArea() {
        System.out.println("Parent Area Fn");
    }
}

class Circle extends Shape{
    int r = 10;
    void findArea() {
        System.out.println("Circle Area: " + 3.14 * r * r);
    }
}

class Square extends Shape{
    int area = 10;
    void findArea() {
        System.out.println("Square Area: " + area * area);
    }
}

public class Polymorphism {
    static void main(String[] args) {
        Shape c = new Circle();
        c.findArea();
        c = new Square();
        c.findArea();
    }
}
