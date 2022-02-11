public class ReverseList extends SLL
{
  public Node ReverseList(Node head)
  {
    if(head == null || head.next == null)
      return head;
    Node prenode = null;
    Node currnode = head;
    while(currnode!=null)
    {
      Node nextnode = currnode.next;
      currnode.next = prenode;
      prenode = currnode;
      currnode = nextnode;
    }
    head = prenode;
    
    return head;
  }
}
