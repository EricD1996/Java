public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double amountOfMoney = 0;

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

    public static int AccountCount(){
        return numberOfAccounts;
    }

    public void Deposit(double amount, String account){
        if (account == "checking"){
            this.checkingBalance += amount;
            System.out.println("CheckingBalance: " + checkingBalance);
        } else if(account == "savings"){
            this.savingsBalance += amount;
            System.out.println("SavingsBalance: " + savingsBalance);
        }
    }
    public void Withdraw(double amount, String account){
        if(account == "checking"){
            if(amount <= this.checkingBalance){
                double newAmount = this.checkingBalance - amount;
                setChecking(newAmount);
            } else{
                System.out.println("Not a valid amount.");
            }
        } else if (account == "savings"){
            if(amount <= this.savingsBalance){
                this.savingsBalance -= amount;
            } else{
                System.out.println("Not a valid amount.");
            }
        }
    }
    // public void Deposit(double amount){
    //     System.out.println("Do you want to deposit to checking or savings:");
    //     String Account = System.console().readLine();
    //     if (Account == "checking"){
    //         checkingBalance += amount;
    //         System.out.println("CheckingBalance: " + checkingBalance);
    //     } else if(Account == "savings"){
    //         savingsBalance += amount;
    //         System.out.println("SavingsBalance: " + savingsBalance);
    //     }
    // }

    // public void Withdraw(double amount){
    //     System.out.println("Do you want to withdraw from checking or savings:");
    //     String Account = System.console().readLine();
    //     if(Account == "checking"){
    //         if(amount <= checkingBalance){
    //             checkingBalance -= amount;
    //         } else{
    //             System.out.println("Not a valid amount.");
    //         }
    //     } else if (Account == "savings"){
    //         if(amount <= savingsBalance){
    //             savingsBalance -= amount;
    //         } else{
    //             System.out.println("Not a valid amount.");
    //         }
    //     }
    // }

    public void Display(){
        System.out.println("Checking Account Balance: " + this.checkingBalance + " Savings Account Balance: " + this.savingsBalance);
    }

    public double getChecking(){
        return checkingBalance;
    }

    public double getSaving(){
        return savingsBalance;
    }

    public void setChecking(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public void setSaving(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

}