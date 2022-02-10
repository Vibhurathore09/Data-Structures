public class PrintMiddle extends SinglyLinkedList
{
    public int PrintMiddle(Node head)
    {
        Node n = head;
        int c=0;
        while(n!=null)
        {
            c++;
            n=n.next;
        }
        Node p = head;
        int count=0;
        while(p.next!=null){
            if(count==Math.ceil(c/2))
                break;
            count++;
            p=p.next;
        }
        return p.data;
    }
}
