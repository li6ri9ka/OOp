public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Smartphone smartphone = new Smartphone();

        laptop.turnOn();
        smartphone.turnOn();
        laptop.brightnessControl();
        laptop.turnOff();
        smartphone.takePhoto();
        smartphone.call();
        smartphone.turnOff();
    }
}
