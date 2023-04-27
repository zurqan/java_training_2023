package session9.part1;

public class BankApplication {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch("Amman");
        bank.addBranch("Irbid");
        bank.addBranch("Zarka");

        bank.print();
//        bank.removeBranchByIndex(0);
        bank.print();
        int ramthaIndex = bank.addBranch("Ramtha");
        System.out.println("ramthaIndex = " + ramthaIndex);
        bank.print();
//        bank.removeBranchByIndex(1);
        bank.print();
//        System.out.println("bank.removeBranchByIndex(3) = " + bank.removeBranchByIndex(3));

//        bank.removeBranchByValue("Amman");
//        bank.print();

        bank.addPhoneNumber("9629898798");
        bank.printPhones();
//        bank.removePhoneByIndex(0);
//        bank.printPhones();
    }
}
