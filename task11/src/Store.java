import java.util.ArrayList;
import java.util.List;

public class Store {
    static List<Product> productsList = new ArrayList<>();

    public static void addProduct(Product product) {
        productsList.add(product);
    }

    public static void removeProduct(Product product) {
        productsList.remove(product);
    }

    public static void searchProduct(String productName) {
        for (Product product : productsList) {
            if (product.getName().equals(productName)) {
                System.out.println(product);
            }
        }

    }

    public static void main(String[] args) {
        Product product1 = new Product("Coconat", 2500.00,5);
        Product product2 = new Product("Watermelon", 100.00,10);
        addProduct(product1);
        addProduct(product2);


        searchProduct("Coconat");
    }


}
