package session9.part1;

import java.util.Arrays;

public class Bank {
    private String[] branches ;
    private int lastIndex =0;
    private int lastPhoneIndex =0;

    private String[] phoneNumbers;
    public Bank() {
        branches = new String[3];
        phoneNumbers= new String[10];
    }

    public int addBranch(String branch){
        if(lastIndex>= branches.length){
            expandBranchesArray();
        }
        branches[lastIndex] = branch;
        return lastIndex++;
    }

    public int addPhoneNumber(String phone){
        if(lastPhoneIndex>= phoneNumbers.length){
            expandPhonesArray();
        }
        phoneNumbers[lastPhoneIndex] = phone;
        return lastPhoneIndex++;
    }

    public boolean removeBranchByValue(String branch){
        for (int i = 0; i < lastIndex; i++) {
            if(branches[i].equals(branch)){
                return removeBranchByIndex(i);
            }
        }

        return false;
    }
    public boolean removePhoneByValue(String phone){
        for (int i = 0; i < lastPhoneIndex; i++) {
            if(phoneNumbers[i].equals(phone)){
                return removePhoneByIndex(i);
            }
        }

        return false;
    }
    public boolean removeBranchByIndex(int index){
        if(index<0 || index >= lastIndex) {
            return false;
        }

        for (int i = index; i < lastIndex-1; i++) {
            branches[i]=branches[i+1];
        }

        branches[--lastIndex]=null;
        return true;
    }
    public boolean removePhoneByIndex(int index){
        if(index<0 || index >= lastPhoneIndex) {
            return false;
        }

        for (int i = index; i < lastPhoneIndex-1; i++) {
            phoneNumbers[i]=phoneNumbers[i+1];
        }

        phoneNumbers[--lastPhoneIndex]=null;
        return true;
    }
    private void expandBranchesArray() {
        branches= Arrays.copyOf(branches,branches.length*2);
    }
    private void expandPhonesArray() {
        phoneNumbers= Arrays.copyOf(phoneNumbers,phoneNumbers.length*2);
    }

    public void print(){

        for (int i = 0; i < lastIndex; i++) {

            System.out.print(branches[i] +" ");
        }

        System.out.println();
    }
    public void printPhones(){

        for (int i = 0; i < lastPhoneIndex; i++) {

            System.out.print(phoneNumbers[i] +" ");
        }

        System.out.println();
    }

//    public String[] getBranches(){
//        return branches;
//    }
}
