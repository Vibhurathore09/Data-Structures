public class PrintAll extends SinglyLinkedList{
    public void printAll(Node head)
    {
        Node p=head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }
}
