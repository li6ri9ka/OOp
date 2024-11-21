import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String login;
    private List<Order> history = new ArrayList<Order>();

    public Customer(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Order> getHistory() {
        return history;
    }

    public void setHistory(List<Order> history) {
        this.history = history;
    }

    public void addOrder(Order order) {
        history.add(order);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'';
    }
}
