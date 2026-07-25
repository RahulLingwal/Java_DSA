package Java07_OOP.Properties.Inheritance.MultiLevel;

public class Manager extends Employee {
    int teamSize;
    String department;

    public Manager() {
        super();
        this.teamSize = 12;
        this.department = "IT";
    }

    public Manager(String name, int age, int id, float salary, int teamSize, String department) {
        super(name, age, id, salary);
        this.teamSize = teamSize;
        this.department = department;
    }

    void conductMeeting() {
        System.out.println("Meeting started");
    }
}
