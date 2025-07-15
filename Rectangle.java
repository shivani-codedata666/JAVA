import java.util.Scanner;
public class Rectangle {



    // LAB-3/Assignment-1

    /*  Write a Java program that uses a method to calculate the area of a rectangle and
compare them using Relational Operator
Steps:
● Create a class Rectangle.
● The Rectangle class should have two attributes length and width of type int.
● Create a constructor that accepts length and width as parameters. ● Area
should be calculated as length*area.
● Instantiate two Rectangle classes with random values.
● Compare the areas of the two rectangles using the Relational Operator. ● If the
first one is bigger than the second one, print “Rectangle1 > Rectangle2”. ● If the
first one is smaller print “Rectangle1 < Rectangle2”.
● Otherwise print “They are equal”.*/


    private int length;
    private int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public int calculateArea() {
        return length * width;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter length and width for Rectangle 1:");
        System.out.print("Length: ");
        int length1 = scanner.nextInt();
        System.out.print("Width: ");
        int width1 = scanner.nextInt();


        System.out.println("\nEnter length and width for Rectangle 2:");
        System.out.print("Length: ");
        int length2 = scanner.nextInt();
        System.out.print("Width: ");
        int width2 = scanner.nextInt();


        Rectangle rectangle1 = new Rectangle(length1, width1);
        Rectangle rectangle2 = new Rectangle(length2, width2);


        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();


        System.out.println("\nArea of Rectangle1: " + area1);
        System.out.println("Area of Rectangle2: " + area2);


        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}



