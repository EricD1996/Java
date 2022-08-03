public class Test {
    public static void main(String[] args){
        BankAccount BankAccount1 = new BankAccount(10000, 12000);
        System.out.println(BankAccount.AccountCount());
        BankAccount1.Display();
        BankAccount1.Deposit(4000, "savings");
        BankAccount1.Display();
        BankAccount1.Withdraw(3000,"savings");
        BankAccount1.Display();
    }
}