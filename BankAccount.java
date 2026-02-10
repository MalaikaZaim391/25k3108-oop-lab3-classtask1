package task1;

public class BankAccount {
    String name;
    double BALANCE;
    String account_number;

    BankAccount(String HolderName, double CurrentBalance, String accountnum){
        this.name = HolderName;
        this.BALANCE = CurrentBalance;
        this.account_number = accountnum;
    }
    void display(){
        System.out.println("Account holder: " + name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Initial Balance: " + BALANCE);
    }
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Ali" , 0, "PK12345678");
        account1.display();
        BankAccount account2 = new BankAccount("Ahmed" , 5600.90, "PK13485465");
        account2.display();
    }

}
