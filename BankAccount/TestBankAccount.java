

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(200, 40);
        System.out.println("Account 1: ");
        account1.accountBalance();
        account1.withdrawMoney(50, "checking");
        System.out.println("New Balance after withdraw: ");
        account1.accountBalance();
        //account1.getTotalBalances();
        // System.out.println(BankAccount.getTotalBalance());
        //System.out.println(account1.getTotalBalances());
        
        BankAccount account2 = new BankAccount(23, 40.00);
        System.out.println("Account2:");
        account2.accountBalance();
        System.out.println("New balance after deposit:");
        account2.depositMoney(10.50, "checking");
        account2.accountBalance();
        //System.out.println(account2.getTotalBalances());
        
        System.out.println(BankAccount.totalBankAccounts());
        System.out.println(BankAccount.getTotalBalances());

        
    }
}
