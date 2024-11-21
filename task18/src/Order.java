import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products = new ArrayList<Product>();
    private Customer customer;
    private double totalSum;


    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addProductInList(Product product) {
        products.add(product);
    }

    public double sum() {
        for (Product product : products) {
            totalSum += product.getPrice();
        }
        return totalSum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products=" + products +
                ", customer=" + customer +
                ", totalSum=" + totalSum +
                '}';
    }
}
