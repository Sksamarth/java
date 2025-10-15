import java.util.*;

class Student {
    String usn, name;
    int[] credits, marks;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("USN:");
        usn = sc.next();
        System.out.println("Name:");
        name = sc.next();
        credits = new int[5];
        marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter credits for subject " + (i + 1) + ":");
            credits[i] = sc.nextInt();
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }
    }

    double calsgpa() {
        int totalCredits = 0, weightedSum = 0;
        for (int i = 0; i < credits.length; i++) {
            int grade = marks[i] / 10;
            weightedSum += grade * credits[i];
            totalCredits += credits[i];
        }
        return (double) weightedSum / totalCredits;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + calsgpa());
    }

    public static void main(String[] args) {
        Student a = new Student();
        a.accept();
        a.display();
    }
}