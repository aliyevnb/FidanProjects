import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Made By Codytex Academy
/*
  This is your main page where the vending machine application is going to be triggered and
  all inputs being accepted.
 */
public class WelcomePage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Codytex Academy sponsored vending machine!");
        System.out.println("What is your name?");

        String name = scanner.next();
        System.out.println("Nice to meet you, " + name);
        System.out.println("Here is available options:");

        Instructions.getInstructions();
        boolean purchaseEnded = false;
        String productName;
        System.out.println("Enter what you want to do: ");
        while (!purchaseEnded) {
            switch (getIntegerInput(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9})) {
                case 0:
                    Instructions.getInstructions();
                    break;
                case 1:
                    // TODO: List all items/products, names of products
                case 2:
                    // TODO: Get item/product info (details, availability), price and inventory number
                case 3:
                    // TODO: Select a product
                case 4:
                    // TODO: Get item/product price
                    System.out.print("Type product name: ");
                    productName = scanner.next();
                    System.out.println("Price of " + productName + " is " + Products.getProductPrice(productName) + " dollars");
                    break;
                case 5:
                    // TODO: List all prices
                case 6:
                    // TODO: Set price range
                case 7:
                    /// TODO: Less than 6 amount in the inventory
                case 8:
                    // TODO: Exit
                case 9:
                    // TODO: Buy an item
            }
        }


        System.out.println("Thanks for using Codytex Academy Vending Machine");

    }

    // Do not touch this method
    private static int getIntegerInput(Integer[] expected) {
        int allOptions = -1;
        for (int i = 1; i <= 3; i++) {
            int input;
            Scanner scanner = new Scanner(System.in);
            try {
                input = scanner.nextInt();

                if (!Arrays.asList(expected).contains(input)) {
                    throw new IOException();
                }
            } catch (Exception e) {
                if (i < 3) {
                    System.out.println("Please enter number in range 0-9");
                    System.out.printf("You have %d more retries", 3 - i);
                    System.out.println();
                } else {
                    System.out.println("Sorry, try next time");
                    System.exit(1);
                }
                continue;
            }
            allOptions = input;
            break;
        }
        return allOptions;
    }
}
