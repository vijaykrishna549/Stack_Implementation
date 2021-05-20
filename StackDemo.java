package com.bridgelabz.datastructures;
class StackRunner
{
    public static void main(String[] args) {
        StackDemo num = new StackDemo();
        num.push(70);
        num.push(30);
        num.push(56);

        System.out.println(num.pop());
        System.out.println(num.peek());
        System.out.println(num.pop());



        num.show();
    }
}


public class StackDemo {


    int stack[] = new int[3];

    int top =0;

    public void push(int data)
    {
        stack[top] = data;
        top++;
    }

    public int pop()
    {
        int data;
        top --;
        data = stack[top];
        stack[top] = 0;
        return data;

    }

    public int peek()
    {
        int data;
        data = stack[top-1];
        return data;

    }

    public void show()
    {
        for (int n : stack)
        {
            System.out.print(n + " ");
        }

    }


}
