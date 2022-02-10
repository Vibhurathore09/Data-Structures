public class SinglyLinkedList {
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
    public void printAll(Node head)
    {
        Node p=head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }
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
    public void InsertEnd(Node head,int x)
    {
        Node n = new Node(x);
        n.next = null;
        Node p = head;
        if(head==null)
        {
            head=n;
            return ;
        }
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=n;
        return;
    }
    public void InsertFront(int new_Data)
    {

        Node n = new Node(new_Data);
        n.next = head;
        head= n;
        return;
    }
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
    public void InsertBefore(Node next_node,int x)
    {
        Node n = new Node(x);
        n.next = next_node;
        if(next_node == head)
        {
            head = new Node(x);
            return ;
        }
        //n.next=null;
        Node p = head;
        while(p.next!=next_node)
        {
            p=p.next;
        }
        p.next = n;
    }
    public Node DeleteFirst(Node head)
    {

        // Move the head pointer to the next node
        Node temp = head;
        head = head.next;
        return head;

    }


    public Node DeleteLast(Node head)
    {
        if(head==null)
        {
            System.out.println("Underflow");
            return null;
        }
        if(head.next==null)
        {
            head = null;
            return head;
        }
        Node p = head;
        while(p.next.next!=null)
        {
            p=p.next;
        }
        p.next = null;
        return head;

    }
    public Node deleteNode(Node head, Node loc)
    {
        if(loc == head)
        {
            head = head.next;
            return head;
        }
        Node p = head;
        while(p.next!=loc)
        {
            p=p.next;
        }
        p.next = loc.next;
        return  head;
    }
    public Node deleteAfter( Node prev)
    {
        if(prev.next == null)
        {
            return null;
        }
        prev.next = prev.next.next;
        return head;
    }
    public Node deleteBefore(Node head,Node loc)
    {
        if(head.next == loc)
        {
            head = loc;
            return head;
        }
        Node p = head;
        while(p.next.next!=loc)
        {
            p=p.next;
        }
        p.next = loc;
        return head;
    }
    public void DeleteList(Node head)
    {
        head = null;
        System.out.println("Linked List Deleted");
    }

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
