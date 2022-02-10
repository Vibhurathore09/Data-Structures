public class DeleteFirst extends SinglyLinkedList{
    public Node DeleteFirst(Node head)
    {

        // Move the head pointer to the next node
        Node temp = head;
        head = head.next;
        return head;

    }
}
