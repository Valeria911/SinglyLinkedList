package excercise;


public class Main {



    public static void main(String[] args) {

        //create a new node
        ListNode head = new ListNode(10);

        //create more nodes
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode tail = new ListNode(40);

        //set next node
        head.setNext(second);
        second.setNext(third);
        third.setNext(tail); //tail keep next=null

        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.display(head);




    }
}
