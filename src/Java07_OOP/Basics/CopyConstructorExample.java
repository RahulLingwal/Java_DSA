package Java07_OOP.Basics;

public class CopyConstructorExample {
    public static void main(String[] args) {
        Student stud = new Student(1, "Rahul", "BCA");

        Student copyStud = new Student(stud);
        System.out.println(copyStud.rollNo);
        System.out.println(copyStud.name);
        System.out.println(copyStud.course);
    }
}

class Student {
    int rollNo;
    String name;
    String course;

    Student(Student details) {
        this.rollNo = details.rollNo;
        this.name = details.name;
        this.course = details.course;
    }

    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
}
