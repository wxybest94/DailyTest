package com.seven.test;

/**
 * 单链表逆序
 */
public class ReverseLinkedList {

    private static Node head;

    public static void reverseLinkedList(){
        if(head==null||head.next==null){
            return;
        }
        Node p1 = head;
        Node p2 = head.next;
        Node p3 = null;

        while(p2!=null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }

        head.next = null;
        head = p1;
    }

    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        //初始化链表
        head = new Node(3);
        head.next = new Node(5);
        Node temp = head.next;
        temp.next = new Node(1);
        temp = temp.next;
        temp.next = new Node(4);
        temp = temp.next;
        temp.next = new Node(9);

        //逆序前输出链表
        temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        //逆序链表
        reverseLinkedList();

        //逆序后输出链表
        temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
