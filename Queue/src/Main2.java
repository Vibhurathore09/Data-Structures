public class Main2 extends  Queue{
    public static void main(String[] args) {
        queue q = new queue(10);
        q.dequeue(q);
        q.Enqueue(10);
        q.Enqueue(20);
        q.dequeue(q);
        q.dequeue(q);
        q.Enqueue(13);
//        System.out.println(q.isFull());
//        System.out.println(q.isEmpty());
//        q.Enqueue(1);
//        q.Enqueue(2);
//        q.Enqueue(3);
//        q.dequeue(q);
//        System.out.println(q.isFull());
//        System.out.println(q.isEmpty());
    }
}
