import java.util.Scanner;
public class FoodOrder {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            String[] starters = {"Spring Rolls", "Paneer Tikka", "Chicken Lollipop"};
            int[] startersPrice = {120, 150, 180};

            String[] mainCourse = {"Veg Biryani", "Butter Chicken", "Paneer Butter Masala"};
            int[] mainCoursePrice = {200, 250, 220};

            String[] drinks = {"Coke", "Lassi", "Lemonade"};
            int[] drinksPrice = {40, 50, 30};

            int totalBill = 0;

            System.out.println("========== Welcome to Java Restaurant ==========");


            System.out.println("\n--- Starters ---");
            for (int i = 0; i < starters.length; i++) {
                System.out.println((i + 1) + ". " + starters[i] + " - ₹" + startersPrice[i]);
            }
            System.out.print("Select a starter (1-3 or 0 to skip): ");
            int starterChoice = sc.nextInt();
            if (starterChoice >= 1 && starterChoice <= 3) {
                totalBill += startersPrice[starterChoice - 1];
            }


            System.out.println("\n--- Main Course ---");
            for (int i = 0; i < mainCourse.length; i++) {
                System.out.println((i + 1) + ". " + mainCourse[i] + " - ₹" + mainCoursePrice[i]);
            }
            System.out.print("Select a main course (1-3 or 0 to skip): ");
            int mainChoice = sc.nextInt();
            if (mainChoice >= 1 && mainChoice <= 3) {
                totalBill += mainCoursePrice[mainChoice - 1];
            }


            System.out.println("\n--- Drinks ---");
            for (int i = 0; i < drinks.length; i++) {
                System.out.println((i + 1) + ". " + drinks[i] + " - ₹" + drinksPrice[i]);
            }
            System.out.print("Select a drink (1-3 or 0 to skip): ");
            int drinkChoice = sc.nextInt();
            if (drinkChoice >= 1 && drinkChoice <= 3) {
                totalBill += drinksPrice[drinkChoice - 1];
            }


            System.out.println("\n======================================");
            System.out.println("Your Total Bill: ₹" + totalBill);
            System.out.println("Thank you for ordering with us! 🍽️");
            System.out.println("======================================");


        }
    }


