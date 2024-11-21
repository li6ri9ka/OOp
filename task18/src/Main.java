public class Main {
    public static void main(String[] args) {
        Product product = new Product("Potato",200.00);
        Product product1 = new Product("Banana",100.00);
        Product product2 = new Product("Tomato", 150.00);
        Customer customer = new Customer("---","--");
        Order order = new Order(1,customer);
        order.addProductInList(product);
        order.addProductInList(product1);
        order.addProductInList(product2);
        customer.addOrder(order);
        System.out.println(customer.getHistory());
        System.out.println(order.sum());

    }
}
