public class GetNth extends SinglyLinkedList
{
    public int GetNth(Node head , int index)
    {
        Node current = head;
        int count = 0; /* index of Node we are
                          currently looking at */
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }

        return 0;
    }
}
