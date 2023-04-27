package session9.part1;

import java.util.Arrays;

public class ExpandedEmployeeArray {

    Employee[] data = new Employee[3];
    int lastIndex=0;
    public int addElement(Employee element){
        if(lastIndex>=data.length){
            expandData();
        }
        data[lastIndex]=element;
        return lastIndex++;
    }

    public boolean removeElementByIndex(int index){
        if(index<0 || index>=lastIndex){
            return false;
        }
        for (int i = index; i < lastIndex-1; i++) {
            data[i]=data[i+1];
        }
        data[--lastIndex] = null;
        return true;
    }
    public Employee getElementByIndex(int index){
        return data[index];
    }
    public boolean removeByValue(Employee element){
        for (int i = 0; i < lastIndex; i++) {
            if(data[i].equals(element)){
                return removeElementByIndex(i);
            }
        }
        return false;
    }

    public void print(){
        for (int i = 0; i < lastIndex; i++) {
            System.out.print( data[i] +"  ");
        }

        System.out.println();
    }

    private void expandData() {
        data= Arrays.copyOf(data,data.length*2);
    }
}
