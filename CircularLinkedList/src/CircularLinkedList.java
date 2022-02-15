public class CircularLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static void printAll(Node head)
    {
        Node n = head;
        if(head != null)
        {
            do {
                System.out.println(n.data + " ");
                n = n.next;
            }while(n!=null);
        }
    }
}
