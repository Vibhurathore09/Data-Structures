public class Main extends SinglyLinkedList{
    public static void main(String[] args) {
        SinglyLinkedList l = new SinglyLinkedList();
        l.head = new Node(1);
        Node second = new Node(3);
        Node third = new Node(5);
        l.head.next = second;
        second.next = third;
        //third.next =null;
        l.InsertEnd(l.head,6);
        l.InsertFront(0);

        l.insertAfter(second,4);
        l.InsertBefore(second,2);
//        l.head = l.DeleteFirst(l.head);
//        l.head = l.DeleteLast(l.head);
//        l.head = l.deleteNode(l.head,third);
//        l.head = l.deleteAfter(second);
//        l.head = l.deleteBefore(l.head,second);
//        l.head = l.Insert_Specificly(l.head,2,-1);
        int a = l.PrintMiddle(l.head);
        System.out.println(a);
        l.printAll(l.head);
    }
}
