import java.util.Scanner;
public class vendingmachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        snack[] snacks = {
                new snack("Cracker", 1),
                new snack("Sandwich", 3),
                new snack("Cookie", 1),
                new snack("Chocolate", 2)
        };
        beverage[] beverages = {
                new beverage("Coffee", 2),
                new beverage("Water", 1),
                new beverage("Tea", 2),
                new beverage("Soda", 2)
        };
        double totalSnackPrice = 0;
        double totalBeveragePrice = 0;
        int totalSnacksTaken = 0;
        int totalBeveragesTaken = 0;

        while (true) {
            System.out.println("Select an item (0 to exit):");
            System.out.println("1. Coffee   2. Water   3. Tea   4. Soda");
            System.out.println("5. Cracker  6. Sandwich  7. Cookie  8. Chocolate");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    totalBeveragePrice += beverages[choice - 1].getPrice();
                    totalBeveragesTaken++;
                    System.out.println("You selected " + beverages[choice - 1].getName());
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    totalSnackPrice += snacks[choice - 5].getPrice();
                    totalSnacksTaken++;
                    System.out.println("You selected " + snacks[choice - 5].getName());
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }

        System.out.println("Total number of beverages : " + totalBeveragesTaken);
        System.out.println("Total number of snacks : " + totalSnacksTaken);
        System.out.println("Total price of all items: $" + (totalBeveragePrice + totalSnackPrice));


    }
}
