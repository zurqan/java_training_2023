package session6;

public class Application {

    public static void main(String[] args) {
//        BankAccount mohammadAccount = new BankAccount(100, 10l, "Mohammad",1);
//
//        BankAccount ahmadAccount = new BankAccount(200, 20l, "Ahmad",2);


        BankAccount mohammadAccount = BankAccount.savingAccount(100, 10l, "Mohammad");

        BankAccount ahmadAccount = BankAccount.currentAccount(200, 20l, "Ahmad");

        mohammadAccount.deposit(200);
        System.out.println("mohammadAccount.balance = " + mohammadAccount.balance);

        int amount =40;
        depositAmount(mohammadAccount,amount);
        System.out.println("mohammadAccount.balance = " + mohammadAccount.balance);
        System.out.println("amount = " + amount);
    }

    public static void depositAmount(BankAccount bankAccount,int amount){
        bankAccount.balance+=amount;
        amount+=40;
    }
}
