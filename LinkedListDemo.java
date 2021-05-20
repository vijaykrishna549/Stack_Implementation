package com.bridgelabz.datastructures;

class Node {

    int data;
    Node next;
}

 class Runner {
    public static void main(String[] args) {


        LinkedListDemo llist = new LinkedListDemo();
        llist.Insert(56);
        llist.Insert(30);
        llist.Insert(70);

        llist.show();


    }
}


public class LinkedListDemo {

    Node head;
    public void Insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while (n.next !=null)
            {
              n = n.next;
            }
            n.next = node;
        }
    }
    public void show()
    {
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


}
