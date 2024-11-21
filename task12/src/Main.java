public class Main {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        payPal.pay();
        payPal.refund();
        CreditCard creditCard= new CreditCard();
        creditCard.pay();
        creditCard.refund();

    }
}
