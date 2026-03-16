package TrickyQuests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesUsingComparator {
    static class Employee {
        int id;
        String name;
        int salary;

        Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(102, "Arjun", 60000));
        list.add(new Employee(101, "Ravi", 90000));
        list.add(new Employee(103, "Karthik", 75000));

        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e2.salary - e1.salary; // Descending order
            }
        });

        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}
