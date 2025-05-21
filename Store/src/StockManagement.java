import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StockManagement {

    HashMap<String, Product> products;
    List<String> OrderOfProducts;

    StockManagement() {
        this.products = new HashMap<>();
        this.OrderOfProducts = new ArrayList<>();
    }

    enum Categories {
        ELECTRONIC,
        FOOD,
        CLOTHET,

    }

//
//    public static void main(String[] args) {
//        StockManagement sm = new StockManagement();
//        sm.addProduct("laptop", "ELECTRONIC", 10, 3000);
//        sm.addProduct("bread", "FOOD", 10, 10);
//        sm.addProduct("wireless mouse", "ELECTRONIC", 10, 30);
//
//        sm.printProducts();
//        System.out.println("----------------------------------");
//        sm.printProductsByCategories("ELECTRONIC");
//        System.out.println("----------------------------------");
//        sm.updateQuantity("laptop", 10);
//
//    }

    void addProduct(String name, String category, int quantity, double price) {
        Categories validatedCategory = this.validateCategory(category);
        if (validatedCategory != null && price > 0 && quantity > 0) {
            this.products.put(name, new Product(name, validatedCategory, quantity, price));
            this.OrderOfProducts.add(name);
            System.out.println("Product [" + name + "] added successfully");
        } else {
            System.out.println("One of the arguments was wrong, please try again");
        }
    }

    void updateQuantity(String name, int quantity) {
        if (this.products.get(name) != null && quantity > 0) {
            this.products.get(name).setQuantity(quantity);
            System.out.println("Quantity of product [" + name + "] updated successfully");
        } else {
            System.out.println("One of the arguments was wrong, please try again");
        }

    }

    void printProducts() {
        if (this.OrderOfProducts.size() == 0) {
            System.out.println("There are no products");
            return;
        }
        for (String product : this.OrderOfProducts) {
            System.out.println(product);
        }
    }

    void printProductsByCategories(String category) {
        Categories validatedCategory = validateCategory(category);
        if (validatedCategory != null) {
            for (Product product : products.values()) {
                if (product.getCategory() == validatedCategory) {
                    System.out.println(product.getName());
                }
            }
        } else {
            System.out.println("There is no such category like: " + category);
        }

    }

    static Categories validateCategory(String category) {
        category = category.toUpperCase();
        switch (category) {
            case "FOOD":
                return Categories.FOOD;
            case "ELECTRONIC":
                return Categories.ELECTRONIC;
            case "CLOTHET":
                return Categories.CLOTHET;
            default:
                return null;
        }
    }


}
