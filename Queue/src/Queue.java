public class Queue
{
    class queue
    {
        int front , rear, capacity,size;
        int arr[];
        queue(int capacity)
        {
            this.capacity = capacity;
            front = this.size-1;
            rear =capacity-1;
            arr = new int[this.capacity];
        }

    }
    boolean isFull(queue q)
    {
        if(q.size == q.capacity)
        {
            return true;
        }
        return false;
    }
}
