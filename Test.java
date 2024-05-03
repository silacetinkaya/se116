import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String operations = "1-add/2-subtract/3-multiply/4-divide";
            System.out.println("Enter operation 1-add/2-subtract/3-multiply/4-divide");
            String input = sc.nextLine();

            if (input.equals("1")) {
                try {
                    ArithmeticOperation a1 = new ArithmeticOperation(5, 6);
                    System.out.println("Result of addition: " + a1.add());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (input.equals("2")) {
                try {
                    ArithmeticOperation a2 = new ArithmeticOperation(8, 9);
                    System.out.println("Result of substract: " + a2.subtract());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (input.equals("3")) {
                try {
                    ArithmeticOperation a3 = new ArithmeticOperation(12, 3);
                    System.out.println("Result of multiply: " + a3.multiply());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }


            } else if (input.equals("4")) {
                try {
                    ArithmeticOperation a4 = new ArithmeticOperation(20, 5);
                    System.out.println("Result of divide: " + a4.divide());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }


            } else {
                System.out.println("Invalid input. Please enter a valid operation.");
            }
        }
    }
}
