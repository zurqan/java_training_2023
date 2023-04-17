package session6;

public class BankAccount {

     int balance;
//    private int balance;

    long accountNumber;

    String name;

    int accountType;//1: Saving, 2:Current , 3: Salary

    public BankAccount(int balance, long accountNumber, String name,int accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType=accountType;
    }

    public static BankAccount savingAccount(int balance, long accountNumber, String name){
        return new BankAccount(balance,accountNumber,name,1);
    }
    public static BankAccount currentAccount(int balance, long accountNumber, String name){
        return new BankAccount(balance,accountNumber,name,2);
    }
    public static BankAccount salaryAccount(int balance, long accountNumber, String name){
        return new BankAccount(balance,accountNumber,name,3);
    }

    public void deposit(int amount){
        this.balance+=amount;
    }

    public void withDraw(int amount){
        balance-=amount;
    }
}
