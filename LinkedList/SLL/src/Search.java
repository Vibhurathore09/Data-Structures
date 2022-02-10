public class Search extends SinglyLinkedList
{
    public boolean Search(Node head,int x )
    {
        Node p = head;
        while(p!=null)
        {
            if(p.data ==x)
                return true;
            p=p.next;
        }
        return false;
    }
}
