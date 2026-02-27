package OOPS;

class Employee1 {
    int empId;
    String name;
    int baseSalary;

    public double calculatebaseSalary(double baseSalary) {
        return baseSalary;
    }
    void displayRole(){

    }
}

class Developer extends Employee1 {
    public double calculatebaseSalary(double baseSalary) {
        return baseSalary + baseSalary / 10;
    }

    public void displayRole() {
        System.out.println("Developer");
    }
}

class Tester extends Employee1 {
    public double calculatebaseSalary(double baseSalary) {
        return baseSalary + ((baseSalary / 10) / 2);
    }

    public void displayRole() {
        System.out.println("Tester");
    }
}

class ProjectManager extends Employee1 {
    public double calculatebaseSalary(double baseSalary) {
        return baseSalary + baseSalary / 5;
    }

    public void displayRole() {
        System.out.println("ProjectManager");
    }
}

public class EmployeeRoleSystem {
    static void main(String[] args) {
        Employee1 e1 = new Developer();
        System.out.println(e1.calculatebaseSalary(100));
        e1.displayRole();
        System.out.println();

        Employee1 e2 = new Tester();
        System.out.println(e2.calculatebaseSalary(100));
        e2.displayRole();
        System.out.println();

        Employee1 e3 = new ProjectManager();
        System.out.println(e3.calculatebaseSalary(100));
        e3.displayRole();
    }
}
