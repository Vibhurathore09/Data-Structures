public class InsertAfter extends SinglyLinkedList{
    public void insertAfter(Node prev_node, int x)
    {
        if(prev_node == null)
        {
            System.out.println("The Given previous node cannot be null");
            return;
        }
        Node n = new Node(x);
        n.next = prev_node.next;
        prev_node.next = n;
    }
}
