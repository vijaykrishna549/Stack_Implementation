package com.bridgelabz.datastructures;

class Node {

    int data;
    Node next;
}

 class Runner {
    public static void main(String[] args) {


        LinkedListDemo llist = new LinkedListDemo();
        llist.Insert(56);
      //  llist.Insert(30);
        llist.Insert(70);

        llist.InsertAt(1,30);
        llist.InsertAt(2,40);

        llist.deleteAt(0);
        llist.deleteAt(2);
        llist.deleteAt(1);


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
    public void InsertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;


        Node n = head;
        for (int i =0; i<index-1;i++)
        {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;

    }

    public void deleteAt(int index)
    {
       if (index == 0)
       {
           head = head.next;
       }
       else
       {
           Node n = head;
           Node n1 = null;
           for (int i=0; i<index-1;i++)
           {
              n = n.next;
           }
           n1 = n.next;
           n.next = n1.next;
         
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
