import java.util.Scanner;

// Made By Codytex Academy
public class Products {

    /*
     * Please add more vending machine features
     * - Buy a product
     * - Search for a product
     * - Get list of products
     */

    private static final String[] products = new String[]{"Monitor", "Mouse", "Keyboard", "USB cable", "Charger",
            "Mouse pad"};
    private static final int[] prices = new int[]{100, 70, 89, 17, 99, 5};
    private static final int[] inventory = new int[]{4, 10, 5, 10, 5, 7};

    public static int getProductPrice(String productName) {
        /*
        This method returns the price for given product. As you see in the parameter we have the productName
        THis method needs to return price according to the product name.
        For Example: if I give the value of Mouse it needs to return the $70
        If we give the value of Charger it needs to return the $99
         */
        int itemPrice = 0;
        for(int i = 0; i < products.length; i++) {
            if(productName.equals(products[i])) {
                itemPrice = prices[i];
            }
        }
        return itemPrice;
    }

    public static boolean selectProduct(Scanner scanner, String productName) {
        /*
        loop over the product list to find out if it is available in our vending machine
        if yes find the price (tip: call a specific method)
        and verify this product is available in inventory
        ask if customer wants to buy it -> if yes call another method to buy a product
											-> if no call method to cancel it

        */
        for(int i = 0; i < products.length; i++){
            if(productName.equals(products[i])){
                System.out.println("Item " + productName + " is available for purchase. Would you like to buy it?");
                String yesOrNo = scanner.next();
                if(yesOrNo.equals("y")){
                    // TODO: invoke buy function
                } else if(yesOrNo.equals("n")){
                    break;
                }
            }
        }
        return false;
    }

    public static boolean buyAProduct(String productName) {
        /*
        Apply payment logic.
        Apply give back change logic
        Apply inventory update logic: if someone buys an item, we should decrement number of available items.
         */
        Scanner scanner = new Scanner(System.in);
        int itemPrice = getProductPrice(productName);
        System.out.println(productName + " price is " + itemPrice);
        System.out.println("Enter money: ");
        return false;
    }

    /*
    Create one method that will set the range for the product. For example if the user set the range
    between $1 to $8 will be able to see only 'Mouse pad' since it is $5.
     */


    /*
    Create one method that will show only the products that have less than 6 amount in the inventory.
    For example: this method needs to print the Monitor, keyboard and charger since there are less than 6 in the
    inventory.
     */
}
