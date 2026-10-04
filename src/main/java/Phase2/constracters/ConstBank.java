package Phase2.constracters;

public class ConstBank {
    Long accountNumber;
    String name;
    double balance = 0;
    boolean active = true;

    ConstBank(Long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0;
        this.active = true;

    }

    void displayAccountdetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        ConstBank account1 = new ConstBank(76273242323L, "John");
        account1.displayAccountdetails();
    }
}
