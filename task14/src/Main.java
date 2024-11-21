public class Main {
    public static void main(String[] args) {
        Point topLeft = new Point(1, 6);
        Point bottomRight = new Point(4, 2);

        Rectangle rectangle = new Rectangle(topLeft, bottomRight);

        System.out.println(rectangle.calculateArea());
    }
}
