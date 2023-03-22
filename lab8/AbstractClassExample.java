// Illustrate the usage of abstract class with following Java classes –
// i>An abstract class “Student‟ with data member roll no, reg no and a abstract method course()
// ii>A subclass “Kiitian” with course() method implementation

abstract class Student {
    int roll;
    int regNo;

    public Student(int rollNo, int regNo) {
        this.roll = rollNo;
        this.regNo = regNo;
    }

    public abstract void course();
}

class Kiitian extends Student {
    public Kiitian(int rollNo, int regNo) {
        super(rollNo, regNo);
    }

    public void course() {
        System.out.println("I am a Kiitian and my course is Computer Science");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Kiitian k = new Kiitian(1234, 5678);
        k.course();
    }
}
