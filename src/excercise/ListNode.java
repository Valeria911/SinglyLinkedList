package excercise;

/**
 * @author v.gutierrez
 * Node generic class with two attributes
 */
public class ListNode{

    //data type stored
    private int data;

    //reference to the next node
    private ListNode next;

    //No args constructor, no reference for next node
    public ListNode(){
    }

    //Object constructor
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }

    //Getters
    //returns data stored
    public int getData(){
        return data;
    }

    //returns reference to the next node
    public ListNode getNext(){
        return next;
    }

    //Setters
    //asign new value to data
    public void setData(int data){
        this.data = data;
    }

    //asign node reference
    public void setNext(ListNode next){
        this.next = next;
    }

    public String toString(){
        return "Data: " + data;
    }
}
