public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposited(double deposit){
        if(deposit>0){
            balance += deposit;
            System.out.println("Баланс успешно пополнен на " + deposit);
        }
        else{
            System.out.println("Сумма должна быть положительная");
        }
    }

    public void withdrawalOfFunds(double sum){
        if(sum<balance && sum > 0){
            balance-=sum;
        }
        else {
            System.out.println("Сумма должна быть положительна или не должна быть больше баланса");
        }
    }

    public void infoAccount(){
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
    }
}
