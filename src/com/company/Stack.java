package com.company;
public class Stack
{
    int tos;
    int stack[];
    Stack(int size)
    {
        tos = -1;
        stack = new int[size];
    }
    public boolean isempty()
    {
        if(tos==-1)
            return true;
        return false;
    }
    public boolean isfull()
    {
        if(tos == stack.length-1)
            return true;
        return false;
    }
    public void push(int data)
    {
        if(isfull())
            System.out.println("Overflow");
        else
        {
            stack[++tos] = data;
            System.out.println(data + " pushed into stack");
        }
    }
    public  int pop()
    {
        int x=stack[tos--];
        if(isempty())
            System.out.println("Undeflow");
        return x;
    }
    public int peek()
    {
        if(tos<0)
            System.out.println("Underflow");
        int x=stack[tos];
        return x;
    }
    void print()
    {
        for (int i = tos; i > -1; i--) {
            System.out.print(" " + stack[i]);
        }
        System.out.println();
    }
}