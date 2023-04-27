package session9.part2;

import session9.part1.Employee;

import java.util.ArrayList;

public class BankV3 {
    private ExpandedArray<String> branches ;
    private ExpandedArray<String> phoneNumbers;

    private ExpandedArray<Employee> employeeData;


    public BankV3() {
        branches = new ExpandedArray();
        phoneNumbers= new ExpandedArray();

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

//        branches.print();
        branches.forEach(new PrintOperation());
    }
    public void printPhones(){

        phoneNumbers.print();
    }

    public ArrayList<String> branchesToArrayList(){
        ToArrayListOperation<String> operation = new ToArrayListOperation<>();
        branches.forEach(operation);

        return operation.getData();
    }

    class PrintOperation implements Operation<String>{

        @Override
        public void doOperation(String s) {
            System.out.println(s +" ");
        }
    }

    class ToArrayListOperation<T> implements Operation<T>{
        ArrayList<T> data =new ArrayList();
        public ToArrayListOperation() {
        }

        @Override
        public void doOperation(T element) {
            data.add(element);
        }

        public ArrayList<T> getData(){
            return data;
        }
    }

//    public String[] getBranches(){
//        return branches;
//    }
}
