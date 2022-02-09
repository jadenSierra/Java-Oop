public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts;
    public static double totalAccountsBalance;

    public BankAccount(){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void setAccountBalnce(String account, int amount){
        if(account == "checking"){
            this.checkingBalance += amount;
        } else if (account == "savings"){
            this.savingsBalance += amount;
        } else {
            System.out.println("Please choose which account to deposit money into: checking or savings");
        }
    }

    public void withdraw(String account, int amount){
        if("checking" == account && amount <= this.checkingBalance){
            System.out.println("you withdrew $" + amount);
            this.checkingBalance -= amount;
        } else if ("checking" == account && amount > this.checkingBalance){
            System.out.println("oof, you dont have that much money in there");
        } else if ("savings" == account && amount <= this.checkingBalance){
            System.out.println("you withdrew $" + amount);
            this.savingsBalance -= amount;
        } else if ("savings" == account && amount > this.checkingBalance){
            System.out.println("oof, you dont have that much money in there");
        } else {
            System.out.println("Please choose which account to deposit money into: checking or savings and enter an amount");
        }
    }

    public double seeAllAccountBalance(){
        double total = 0.0;
        total = this.checkingBalance + this.savingsBalance;
        return total;
    }
}