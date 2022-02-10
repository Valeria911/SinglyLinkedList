package excercise;

public class SinglyLinkedList {

    private ListNode head;

    //method to print the full singly linked list
    public void display(ListNode head) {
        ListNode current = head;
        while (current != null){
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
