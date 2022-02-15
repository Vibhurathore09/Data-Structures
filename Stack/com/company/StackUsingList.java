package com.company;

public class StackUsingList
{
    StackNode head;
    static class StackNode
    {
        int data;
        StackNode next;
        StackNode(int data)
        {
            this.data = data;
        }
    }
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        return false;
    }
    public static int length(StackNode head)
    {
        StackNode a = head;
        int c=1;
        while(a.next!=null)
        {
            a=a.next;
            c++;
        }
        return c;
    }
    public void push(int x)
    {
        StackNode n = new StackNode(x);
        if(head == null)
        {
            head = n;
        }
        else
        {
            StackNode temp = head;
            head = n;
            n.next = temp;
        }
        System.out.println(x+" data pushed to stack");
    }
    public int pop()
    {
        int n=0;
        System.out.print("Poped element is -> ");
        if(head == null)
            System.out.println("Stack in Empty");
        else
        {
            n = head.data;
            head = head.next;
        }

        return n;
    }
    public int peek()
    {
        if(head == null)
            System.out.println("Stack in Empty");
        System.out.print("Peek element -> ");
        return head.data;
    }
    public void printStack()
    {
        if(head==null)
            System.out.println("Stack is Empty");
        else
        {
            StackNode n = head;
            System.out.println("Printing Stack");
            while(n!=null)
            {
                System.out.print(n.data+" ");
                n = n.next;
            }
            System.out.println();
        }
    }
}
