public class DeleteNode extends SinglyLinkedList
{
    public Node deleteNode(Node head, Node loc)
    {
        if(loc == head)
        {
            head = head.next;
            return head;
        }
        Node p = head;
        while(p.next!=loc)
        {
            p=p.next;
        }
        p.next = loc.next;
        return  head;
    }
}
