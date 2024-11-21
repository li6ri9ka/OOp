public class Rectangle {
    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    public Point getLeftUp() {
        return leftUp;
    }

    public void setLeftUp(Point leftUp) {
        this.leftUp = leftUp;
    }

    public Point getRightDown() {
        return rightDown;
    }

    public void setRightDown(Point rightDown) {
        this.rightDown = rightDown;
    }

    public double calculateArea() {
        double length = Math.abs(leftUp.getX() - rightDown.getX());
        double width = Math.abs(leftUp.getY() - rightDown.getY());
        return length * width;
    }
}


