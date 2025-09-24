class Course {
    private String courseName;
    private String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return courseName + " (" + duration + ")";
    }
}

class Student1 {
    private String name;
    private Course enrolledCourse;

    public Student1(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    public String getName() {
        return name;
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name + " Course: " + enrolledCourse;
    }
}

class PremiumStudent extends Student1 {
    private int discount;

    public PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + getName() + " Course: " + getEnrolledCourse() + " Discount: " + discount + "%";
    }
}

public class I_OnlineCoursePlatform {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java", "3 months");

        Student1 s1 = new Student1("Arjun", javaCourse);

        PremiumStudent s2 = new PremiumStudent("Meena", javaCourse, 20);

        System.out.println(s1);
        System.out.println(s2);
    }
}
