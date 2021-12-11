public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();

        myBankAccount.makeDeposit(12.00, "checking");
        myBankAccount.makeDeposit(8.00, "savings");
        myBankAccount.withdrawl(2.00, "checking");
        myBankAccount.withdrawl(6.00, "savings");
        myBankAccount.accountBalanceCheckAndSave();
        BankAccount.getNumOfAccounts(); //belongs to BankAccount class
        System.out.println(BankAccount.totalAccountsBalance);  //belongs to BankAccount class



    }
}
