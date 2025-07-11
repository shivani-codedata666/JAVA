import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        NumberOperations obj = new NumberOperations();
        obj.process();

    }

    public void process() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();


        Swap_num(number1 , number2);
        Arithmetic_operation(number1, number2);
        Greater_than(number1 , number2);

    }

    public void Arithmetic_operation (int num1 , int num2)
    {
        int sum = num1 + num2;
        System.out.println("Sum of the number: " + sum);
    }

    public void Swap_num(int num1 , int num2){
        System.out.println("Before swapping:");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void Greater_than (int num1 , int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}


