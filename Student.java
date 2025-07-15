

public class Student {
    public static void main(String[] args) {

    }
    String name;
    String address;
    int[] marks = new int[5];
    int total;
    int average;
    String grade;


    void calculateGrade() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 5;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";

        }
    }

    void display() {
        System.out.println("name:" + name);
        System.out.println("address:" + address);
        System.out.println("marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("subject" + (i + 1) + ":" + marks[i]);
        }
        System.out.println("total:" + total);
        System.out.println("average:" + average);
        System.out.println("Grade:" + grade);
    }
}

