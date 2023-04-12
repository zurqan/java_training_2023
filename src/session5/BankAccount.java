package session5;

public class BankAccount {

    int balance;
    long accountNumber;
    String name;

    public void deposit(int amount){
        //TODO check amount should be grater than 0
        balance+=amount;
    }

    public void withdraw(int amount){
        //TODO check if this operation is valid
        balance-=amount;
    }

    public void printInfo(){
        System.out.println("====================");
        System.out.println("Balance:  "+balance);
        System.out.println("name:  "+name);
    }

    public static void main(String[] args) {
        BankAccount ahmadAccount = new BankAccount();
        ahmadAccount.name="Ahmad";
        BankAccount mohammadAccount = new BankAccount();
        mohammadAccount.name="Mohammad";

        ahmadAccount.deposit(100);
        ahmadAccount.printInfo();
        mohammadAccount.printInfo();

        ahmadAccount.withdraw(70);
        ahmadAccount.printInfo();
    }
}
