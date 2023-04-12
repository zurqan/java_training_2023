package session5;


public class BankAccountV2 {

    int balance;
    long accountNumber;
    String name;

    static String bankName="Islamic Bank";

    static long lastAccountNumber =0;

    public BankAccountV2(String name,int balance){
        this.name=name;
        this.balance=balance;
        this.accountNumber=++lastAccountNumber;
    }

    public void deposit(int amount){
        //TODO check amount should be grater than 0
        balance+=amount;
    }

    public void withdraw(int amount){
        //TODO check if this operation is valid
        balance-=amount;
    }

    public  long getBalance(){
        return balance;
    }

    public static long getLastAccountNumber(){
        return lastAccountNumber;
    }

    public void printInfo(){
        System.out.println("====================");
        System.out.println("Balance:  "+this.balance);
//        System.out.println("Balance:  "+balance);
        System.out.println("name:  "+name);
        System.out.println("name:  "+this.name);
        System.out.println("bankName = " + bankName);
        System.out.println("accountNumber = " + accountNumber);

//        System.out.println("lastAccountNumber = " + this.lastAccountNumber);
        System.out.println("lastAccountNumber = " + BankAccountV2.lastAccountNumber);
    }

    public static void main(String[] args) {
        BankAccountV2 ahmadAccount = new BankAccountV2("Ahmad",0);
        BankAccountV2 mohammadAccount = new BankAccountV2("Mohammad",400);

        ahmadAccount.deposit(100);
        ahmadAccount.printInfo();
        mohammadAccount.printInfo();

        ahmadAccount.withdraw(70);
        ahmadAccount.printInfo();

//        System.out.println("BankAccountV2.bankName = " + BankAccountV2.bankName);

        System.out.println("mohammadAccount.getBalance() = " + mohammadAccount.getBalance());
        System.out.println("ahmadAccount.getBalance() = " + ahmadAccount.getBalance());

        System.out.println("BankAccountV2.getLastAccountNumber() = " + BankAccountV2.getLastAccountNumber());
    }
}

