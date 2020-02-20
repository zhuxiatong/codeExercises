package linked;

import pojo.Node;

import java.util.Scanner;


public class linked {
     Node head = null;
     int size = 0;

     //添加节点
    void addNode(int data){
        if (head == null){
            Node node = new Node(data);
            node.num = data;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp = new Node(data);
    }
    //删除节点
    void deleteNode(int data){
        if (head == null){
            System.out.println("该链表为空，不能删除数据");
        }
        Node tmp = head;
        while(tmp.num != data){
            tmp = tmp.next;
        }

    }
    //添加节点
    //修改节点
    //遍历链表
    //单链表反转
    //链表中环的检测
    //两个有序的链表合并
    //删除链表倒数第那个节点
    //求链表的中间节点
}
