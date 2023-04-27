package session9.part2;


import java.util.ArrayList;

public class BankApplication3 {

    public static void main(String[] args) {
        BankV3 bank = new BankV3();
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

        ArrayList<String> branches = bank.branchesToArrayList();

        System.out.println("branches = " + branches);
    }
}
