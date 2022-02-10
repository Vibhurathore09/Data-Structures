public class InsertFront extends SinglyLinkedList {
    public void InsertFront(int new_Data)
    {

        SinglyLinkedList.Node n = new SinglyLinkedList.Node(new_Data);
        n.next = head;
        head= n;
        return;
    }
}
