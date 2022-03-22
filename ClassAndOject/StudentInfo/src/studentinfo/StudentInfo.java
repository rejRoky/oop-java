package studentinfo;

public class StudentInfo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = "25236-56";
        s1.name = "Rick Denver";
        s1.course = "Math-001";
        s1.m1 = 80;
        s1.m2 = 60;
        s1.m3 = 70;

        System.out.println(s1); /// toString method call 
        System.out.println("Total Mark: " + s1.totalMark());
        System.out.println("Average Mark: " + s1.averageMark());
        System.out.println("Grade: " + s1.grade());

    }

}

class Student {

    /// Properties
    public String roll;
    public String name;
    public String course;
    public double m1, m2, m3;

    /// Methods or Behavior
    public double totalMark() {
        return m1 + m2 + m3;
    }

    public double averageMark() {
        return totalMark() / 3;

    }

    public char grade() {
        if (averageMark() >= 70) {
            return 'A';
        } else if (averageMark() >= 60) {
            return 'B';
        } else if (averageMark() >= 50) {
            return 'C';
        } else if (averageMark() >= 40) {
            return 'B';
        } else {
            return 'F';
        }

    }

    public String toString() {
        return "Student Name: " + name + "\nStudent Roll: " + roll + "\nStudent Course: " + course;

    }

}
