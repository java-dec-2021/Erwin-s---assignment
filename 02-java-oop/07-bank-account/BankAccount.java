public class BankAccount{ //Create a BankAccount class.
    private double checkingBalance; //The class should have the following attributes: (double) checking balance
    private double savingsBalance;  //(double) savings balance.
    public static int numOfAccounts  = 0; // Create a class member (static) that has the number of accounts created thus far.
    public static double totalAccountsBalance = 0;      //Create a class member (static) that tracks the total amount of money stored in every account created.

    public BankAccount(){ 
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numOfAccounts++; //In the constructor, be sure to increment the account count
    }

    public static void getNumOfAccounts(){
        System.out.println(numOfAccounts);
    }

    private void setChecking(double amount){
        this.checkingBalance = amount;
    }

    private void setSavings(double amount){
        this.savingsBalance = amount;
    }

    public double getChecking(){ //Create a getter method for the user's checking account balance.
        return this.checkingBalance;
    }

    public double getSavings(){ //Create a getter method for the user's saving account balance.
        return this.savingsBalance;
    }

    public void makeDeposit(double amount, String accountType){// Create a method that will allow a user to deposit money into either the checking or savings, be sure to add to total amount stored.
        if(accountType.equals("checking")){
            this.setChecking(this.getChecking() + amount);
        }
        else if(accountType.equals("savings")){
            this.setSavings(this.getSavings() + amount);
        }
        totalAccountsBalance += amount;
    }

    public void withdrawl(double amount, String accountType){  //Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
        if(accountType.equals("checking")){
            if(amount > this.checkingBalance){
                System.out.println("Insufficient Funds.");
            }
            else{
                this.setChecking(this.getChecking() - amount);
            }
        }
        else if(accountType.equals("savings")){
            if(amount > this.savingsBalance){
                System.out.println("Insufficient Funds");
            }
            else{
                this.setSavings(this.getSavings() - amount);
            }
        }
        totalAccountsBalance -= amount;
    }

    public void accountBalanceCheckAndSave(){ //Create a method to see the total money from the checking and saving
        System.out.println("Checking: " + "$" + this.getChecking() );
        System.out.println("Savings: " + "$" + this.getSavings());
    }

}