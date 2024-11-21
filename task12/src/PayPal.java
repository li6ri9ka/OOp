public class PayPal implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("PayPal: Оплата прошла");
    }

    @Override
    public void refund() {
        System.out.println("PayPal: Возврат средств");

    }
}
