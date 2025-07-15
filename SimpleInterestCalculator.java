import java.util.Scanner;
public class SimpleInterestCalculator {
//SESSION-1
/*Write a program to enter P,T (principal and time) and calculate
simple interest. Use the Scanner class for taking inputs from the
console. Users will enter the principal amount and time(in years).
Create an if-else statement and modify the interest rate based on the
principal amount. If the amount > 10000 then the interest rate is 10%. If the
amount is between 10000 and 5000 then make the interest rate 8%. For
any amount below 5000 the interest rate should be 5%.*/

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input Principal and Time
            System.out.print("Enter Principal amount (P): ");
            double principal = scanner.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = scanner.nextDouble();

            double rate;

            // Determine interest rate based on principal amount
            if (principal > 10000) {
                rate = 10.0;
            } else if (principal >= 5000 && principal <= 10000) {
                rate = 8.0;
            } else {
                rate = 5.0;
            }

            // Calculate Simple Interest
            double interest = (principal * rate * time) / 100;

            // Display results
            System.out.println("\nPrincipal: ₹" + principal);
            System.out.println("Time: " + time + " years");
            System.out.println("Interest Rate: " + rate + "%");
            System.out.println("Simple Interest: ₹" + interest);

            scanner.close();
        }
    }


