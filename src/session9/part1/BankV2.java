package session9.part1;

public class BankV2 {
    private ExpandedStrArray branches ;
    private ExpandedStrArray phoneNumbers;


    public BankV2() {
        branches = new ExpandedStrArray();
        phoneNumbers= new ExpandedStrArray();
    }

    public int addBranch(String branch){
        return branches.addElement(branch);
    }

    public int addPhoneNumber(String phone){
        return phoneNumbers.addElement(phone);
    }

    public boolean removeBranchByValue(String branch){
        return branches.removeByValue(branch);
    }
    public boolean removePhoneByValue(String phone){
        return phoneNumbers.removeByValue(phone);
    }
    public boolean removeBranchByIndex(int index){
        return branches.removeElementByIndex(index);
    }
    public boolean removePhoneByIndex(int index){
        return phoneNumbers.removeElementByIndex(index);
    }
    public void print(){

        branches.print();
    }
    public void printPhones(){

        phoneNumbers.print();
    }

//    public String[] getBranches(){
//        return branches;
//    }
}
