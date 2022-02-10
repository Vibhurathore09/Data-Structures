public class InsertBefore extends SinglyLinkedList
{
    public void InsertBefore(Node next_node,int x)
    {
        Node n = new Node(x);
        n.next = next_node;
        if(next_node == head)
        {
            head = new Node(x);
            return ;
        }
        //n.next=null;
        Node p = head;
        while(p.next!=next_node)
        {
            p=p.next;
        }
        p.next = n;
    }
}
