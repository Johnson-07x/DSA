package OOPS;

abstract class Employee {
    protected String name;
    Employee(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Employee Name: " + name);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name) {
        super(name);
    }

    public double calculateSalary() {
        return 120000;
    }
}

class Intern extends Employee {
    Intern(String name) {
        super(name);
    }

    public double calculateSalary() {
        return 30000;
    }
}

public class EmployeeInheritance {
    static void main(String[] args) {
        Intern intern = new Intern("Jack");
        intern.getName();
        System.out.println(intern.calculateSalary());
    }
}
