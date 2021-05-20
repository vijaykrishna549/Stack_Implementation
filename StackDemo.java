package com.bridgelabz.datastructures;
class StackRunner
{
    public static void main(String[] args) {
        StackDemo num = new StackDemo();
        num.push(70);
        num.push(30);
        num.push(56);





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



    public void show()
    {
        for (int n : stack)
        {
            System.out.print(n + " ");
        }

    }


}
