package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Infix_to_prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(convert(s));


    }
    public static boolean isOperator(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }
    public static String convert(String s)
    {
        java.util.Stack<String> stack = new Stack<String>();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if(isOperator(c))
            {
                String op1= stack.pop();
                String op2= stack.pop();

                String temp = "(" + op1 + c + op2 +")";
                stack.push(temp);
            }
            else
                stack.push(c+"");
        }
        return stack.pop();
    }
}
