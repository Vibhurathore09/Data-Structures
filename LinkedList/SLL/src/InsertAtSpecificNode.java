public class InsertAtSpecificNode extends SinglyLinkedList{
    public Node Insert_Specificly(Node head, int pos,int x)
    {
        Node n= new Node(x);
        Node p = head;
        if(pos<1)
        {
            System.out.println("Entered positon doesnt exit");
        }
        else
        {
            if(pos == 1)
            {
                n.next = head;
                head = n;
                return head;
            }
            else
            {
                int c =0;
                while (c==pos-1 && p!=null)
                {
                    c++;
                    p=p.next;
                }
                n.next = p.next;
                p.next=n;
            }
        }
        return head;
    }
}
