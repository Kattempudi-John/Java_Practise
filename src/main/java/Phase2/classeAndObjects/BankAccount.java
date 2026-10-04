package Phase2.classeAndObjects;

public class BankAccount {
    String accountNumber;
    double balance;
    static String bankName = "SBI Bank";

    public void AccountDetails(String accountNumber, double balance) {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
        System.out.println(bankName);
    }

//    public void displayBankDetails() {
//        System.out.println("Account Number: " + accountNumber);
//        System.out.println("Balance: " + balance);
//    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.AccountDetails("743423423", 2500);

        bankAccount.AccountDetails("73678346873", 3500);
        bankAccount.AccountDetails("3224234434", 4500);
    }
}
