public class Queue
{
    static class queue
    {
        int front , rear;
        int arr[];
        queue(int size)
        {
            front = rear = -1;
            arr = new int[size];
        }
        boolean isFull()
        {
            if(rear == arr.length-1)
            {
                return true;
            }
            return false;
        }
        boolean isEmpty()
        {
            if(front ==-1|| rear == -1)
                return true;
            return false;
        }
        public void Enqueue(int val)
        {
            if(isFull())
            {
                System.out.println("Overflow");
                return;
            }
            else if(isEmpty())
            {
                front = rear= 0;
                arr[rear] = val;
            }
            else
            {
                rear++;
                arr[rear] = val;
            }
            //System.out.println("Rear "+rear);
            System.out.println("Queued to queue "+val);
        }
        public void dequeue(queue q)
        {
            if(q.isEmpty())
            {
                System.out.println("Underflow");
                return;
            }
            else
            {
                System.out.println(q.arr[front]);
                front++;
            }
            if(front>rear)
                front = rear = -1;
        }
    }
}
