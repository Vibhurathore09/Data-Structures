public class DeleteBefore extends SinglyLinkedList
{
    public Node deleteBefore(Node head,Node loc)
    {
        if(head.next == loc)
        {
            head = loc;
            return head;
        }
        Node p = head;
        while(p.next.next!=loc)
        {
            p=p.next;
        }
        p.next = loc;
        return head;
    }
}
