public class DeleteAfter extends SinglyLinkedList{
    public SinglyLinkedList.Node deleteAfter(SinglyLinkedList.Node prev)
    {
        if(prev.next == null)
        {
            return null;
        }
        prev.next = prev.next.next;
        return head;
    }
}
