public class Main2 extends  Queue{
    public static void main(String[] args) {
        queue q = new queue(10);
        q.dequeue(q);
        q.Enqueue(10,q);
        q.Enqueue(20,q);
        q.dequeue(q);
        q.dequeue(q);
        q.Enqueue(13,q);
//        System.out.println(q.isFull(q));
//        System.out.println(q.isEmpty(q));
//        q.Enqueue(1,q);
//        q.Enqueue(2,q);
//        q.Enqueue(3,q);
//        q.dequeue(q);
//        System.out.println(q.isFull(q));
//        System.out.println(q.isEmpty(q));
    }
}
