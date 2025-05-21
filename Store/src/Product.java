public class Product {

    private String name;
    private StockManagement.Categories category;
    private int quantity;
    private double price;

    public Product(String name, StockManagement.Categories category, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public StockManagement.Categories getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity += quantity;

    }
}
