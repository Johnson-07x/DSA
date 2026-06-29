package Revision;

class Student {
    int num;
    Student() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

public class Objects {
    public static void main(String[] args) {
        Student s = new Student();

        for (int i = 0; i < 1000000000; i++) {
            s = new Student();
        }
    }
}
