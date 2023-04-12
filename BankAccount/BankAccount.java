

public class BankAccount {
    private  double checkingBalance;
    private  double savingsBalance;

    private static int numberOfAccounts = 0;
    private static  double totalAccountBalance = 0;

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        
       totalAccountBalance += checkingBalance + savingsBalance;
    }
    
    // total number of accounts
    public static int totalBankAccounts() {
        System.out.println("Total number of accounts:");
    	return numberOfAccounts;
    }
    
    // Account balances
    public void accountBalance() {
        System.out.printf("Checking: %.2f , Savings: %.2f \n", this.checkingBalance, this.savingsBalance );
    }

    //getter for checking balance
    public double getCheckingBalance(){
        return checkingBalance;
    }

    //getter for savings balance
    public double getSavingsBalance(){
        return savingsBalance;
    }
    
    // display total accounts balances
    public static double getTotalBalances() {
    	System.out.println("Total Balances for all accounts: ");   	
    	return totalAccountBalance;
    	
    }
    // Deposit money
    public void depositMoney(double amount, String account) {
        if(account.equals("checking"))
            this.checkingBalance += amount;
        else if (account.equals("savings")) 
            this.savingsBalance += amount;
        BankAccount.totalAccountBalance += amount;
    } 

    // Withdraw money
    public void withdrawMoney(double amount, String account){
        boolean withdraw = false;
        
    	if(account.equals("checking"))
            if(this.checkingBalance - amount >= 0){
            	withdraw = true;
                this.checkingBalance -= amount;
            }
            else {
            	System.out.println("Not enough funds to withdraw from: " + account);
            }
        else if (account.equals("savings")) 
            if(this.savingsBalance - amount >= 0){
            	withdraw = true;
                this.savingsBalance -= amount;
            }
            else {
            	System.out.println("Not enough funds to withdraw from: " + account);
            }
        BankAccount.totalAccountBalance -= amount;
    }
}
