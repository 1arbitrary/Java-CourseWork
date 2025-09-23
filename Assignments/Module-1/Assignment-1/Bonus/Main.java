import java.util.Scanner;

public class Main {
    public static String[] students = new String[5];
    public static int[] marks = new int[5];
    public static String[] grades = new String[5];

    public static void addstudent() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the names and marks of students :- ");

        int i = 0;
        do {
            System.out.println(" Student no " + (i + 1) + " : ");
            students[i] = scan.next();
            System.out.println(" Marks : ");
            marks[i] = scan.nextInt();
            i++;
        } while (i <= 4);
    }

    public static void viewstudent() {
        int total = 0;

        int i = 0;
        do {
            total = total + marks[i];
            i++;
        } while (i <= 4);

        // showing details of all students
        i = 0;
        do {
            System.out.println("student no " + (i + 1) + " : " + students[i] + "\t marks : " + marks[i]);
            i++;
        } while (i <= 4);
    }

    public static void search() {
        Scanner scan = new Scanner(System.in);
        String a;
        System.out.println("Enter the student you want to search : ");
        a = scan.next();

        boolean found = false;
        int i = 0;
        do {
            if (a.equals(students[i])) {
                System.out.println("student : " + students[i] + "\t marks : " + marks[i]);
                found = true;
                break;
            }
            i++;
        } while (i < students.length);

        if (!found) {
            System.out.println("Student does not exist");
        }
    }
    
    public static void choice() {
    	Scanner scan = new Scanner(System.in);
        int a;

        int i = 3;
        do {
            System.out.println("Enter 1 to add student\n 2 to view all students\n 3 to search student");
            a = scan.nextInt();

            switch (a) {
                case 1:
                    addstudent();
                    break;
                case 2:
                    viewstudent();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    System.out.println("Invalid Search");
            }

            i--;
        } while (i > 0);
    }
    
    public static void main(String[] args) {
        choice();
    }
}
