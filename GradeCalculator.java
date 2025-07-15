import java.util.Scanner;
public class GradeCalculator {
   //SESSION-1
    /*Write a program to enter marks of five subjects and calculate total
marks and average. Each subject has a full mark of 100. Give grades
based on average marks. Grades should be Ex (>90%), A (>80%) ,
B(>60%) ,C (>=40%) and F(<40%). Use the Scanner class to take
inputs from the console.*/

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalMarks = 0;
            int numberOfSubjects = 5;

            System.out.println("Enter marks for 5 subjects (each out of 100):");


            for (int i = 1; i <= numberOfSubjects; i++) {
                System.out.print("Subject " + i + ": ");
                int marks = scanner.nextInt();


                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                    i--;
                    continue;
                }

                totalMarks += marks;
            }


            double average = totalMarks / (double) numberOfSubjects;


            System.out.println("\nTotal Marks: " + totalMarks + "/500");
            System.out.println("Average Marks: " + average + "%");


            String grade;
            if (average > 90) {
                grade = "Ex";
            } else if (average > 80) {
                grade = "A";
            } else if (average > 60) {
                grade = "B";
            } else if (average >= 40) {
                grade = "C";
            } else {
                grade = "F";
            }


            System.out.println("Grade: " + grade);

            scanner.close();
        }
    }
