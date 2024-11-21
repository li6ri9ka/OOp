public class CreditCard implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("CreditCard: Оплата прошла");
    }

    @Override
    public void refund() {
        System.out.println("CreditCard: Возврат средств");

    }
}
