package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
//        StackUsingList l = new StackUsingList();
//        l.push(1);
//        l.push(2);
//        l.push(3);
//        l.printStack();
//        System.out.println(l.pop());
//        l.printStack();
//        System.out.println(l.peek());
//        l.isEmpty();

    }
}
