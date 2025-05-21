import java.util.Scanner;

public class Store {

    Scanner in = new Scanner(System.in);

    private StockManagement stockManagement;

    public Store() {
        this.stockManagement = new StockManagement();
    }

    public void addProduct() {
        System.out.println("Enter the product name");
        String productName = in.next();
        if (productName.length() == 0) {
            System.out.println("The category typed are wrong");
            return;
        }
        System.out.println("Enter the product category");
        String category = in.next();
        if (StockManagement.validateCategory(category) == null) {
            System.out.println("The category typed are wrong");
            return;
        }
        System.out.println("Enter the product quantity");
        int quantity = in.nextInt();
        if(quantity<= 0){
            System.out.println("The quantity typed are wrong");
            return;
        }
        System.out.println("Enter the product price as a double");
        double price = in.nextDouble();
        if(price<= 0){
            System.out.println("The price typed are wrong");
            return;
        }
        this.stockManagement.addProduct(productName,category,quantity,price);
    }

    public void updateProduct() {
        System.out.println("Type desired product");
        String product = in.next();
        System.out.println("Type desired quantity");
        int quantity = in.nextInt();
        this.stockManagement.updateQuantity(product, quantity);
    }

    public void printProductsInStock() {
        this.stockManagement.printProducts();
    }

    public void printProductsByCategory() {
        System.out.println("Type desired category");
        String category = in.next();
        this.stockManagement.printProductsByCategories(category);

    }
}
