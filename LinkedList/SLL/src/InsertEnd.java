public class InsertEnd {
    public void InsertEnd(SinglyLinkedList.Node head, int x)
    {
        SinglyLinkedList.Node n = new SinglyLinkedList.Node(x);
        n.next = null;
        SinglyLinkedList.Node p = head;
        if(head==null)
        {
            head=n;
            return ;
        }
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=n;
        return;
    }
}
