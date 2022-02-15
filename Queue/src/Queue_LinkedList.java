public class Queue_LinkedList {
    Node front , rear;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public boolean isEmpty()
    {
        if(front == null)
            return true;
        return false;
    }
    public void Enqueue(int val)
    {
        Node n = new Node(val);
        if(isEmpty())
        {
            front = rear = n;
        }
        else
        {
            rear.next = n;
            rear = n;
        }
    }
    public void dequeue()
    {
        if(isEmpty())
            System.out.println("UnderFlow");
        else if (front != null) {
            System.out.println(front.data);
            front = front.next;
        }
    }
    public static void main(String[] args) {
        Queue_LinkedList obj=new Queue_LinkedList();
        obj.dequeue();
        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.dequeue();
        obj.Enqueue(40);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
    }
}
