public class DeleteLast extends SinglyLinkedList{
    public Node DeleteLast(Node head)
    {
        if(head==null)
        {
            System.out.println("Underflow");
            return null;
        }
        if(head.next==null)
        {
            head = null;
            return head;
        }
        Node p = head;
        while(p.next.next!=null)
        {
            p=p.next;
        }
        p.next = null;
        return head;

    }
}
