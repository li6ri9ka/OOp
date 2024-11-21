public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("qwe",0);
        account.infoAccount();
        account.deposited(123);

        account.infoAccount();
    }


}
