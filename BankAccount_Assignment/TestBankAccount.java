public class TestBankAccount{
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();

        account1.setAccountBalnce("checking", 1000);
        account1.setAccountBalnce("savings", 1000);
        account1.withdraw("checking", 500);

        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.seeAllAccountBalance());

    }
}