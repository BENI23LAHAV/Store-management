import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Store store = new Store();
//
//Basic interface for testing
//


        while (true) {
            System.out.println("Choose the wanted action");
            System.out.println("1 : Add a new product");
            System.out.println("2 : Update product quantity");
            System.out.println("3 : Print all products,  ordered by input");
            System.out.println("4 : Print  products by category");

            int choice = in.nextInt();


            switch (choice) {
                case 1:
                    store.addProduct();
                    break;
                case 2:
                    store.updateProduct();
                    break;
                case 3:
                    store.printProductsInStock();
                    break;
                case 4:
                    store.printProductsByCategory();
                    break;

                default:
                    System.out.println("Wrong choice");

            }
        }


    }
}