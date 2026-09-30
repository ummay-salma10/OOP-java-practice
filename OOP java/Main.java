class Person {
    public int id;
    public String name;
    public int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

    public String personType() {
        if (age < 13) {
            return "Child";
        } else if (age > 12 && age < 20) {
            return "Teen";
        } else if (age > 19 && age < 40) {
            return "Adult";
        } else {
            return "Old";
        }
    }
}

class Student extends Person {
    public double result;

    public Student(int id, String name, int age, double result) {
        super(id, name, age);
        this.result = result;
    }

    

    @Override
    public String toString() {
        return super.toString() + ", Result: " + result;
    }

    public String studentClass() {
        if (result >= 3.00) {
            return "First Class";
        } else if (result >= 2.00) {
            return "Second Class";
        } else if (result >= 1.00) {
            return "Third Class";
        } else {
            return "Failed";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1216, "Salma", 22, 3.85);

        System.out.println("Details: " + student.toString());
        System.out.println("Person Type: " + student.personType());
        System.out.println("Class: " + student.studentClass());
    }
}
