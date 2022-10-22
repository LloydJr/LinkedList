package com.zipcodewilmington.singlylinkedlist;

import com.sun.xml.internal.bind.v2.TODO;
import javafx.scene.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList extends iNode {


    // TODO Refreshing LinkedList
    /**
     * add -- add an element to the list
     * remove -- remove an element (specified by numeric index) from the list
     * contains -- returns true if the element is in the list, false otherwise
     * find -- returns the element's index if it is in the list, -1 otherwise
     * size -- returns the current size of the list
     * get -- returns the element at the specified index
     * copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
     * sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
     *
     * implement your linked list as a generic class that can store any type of object
     * Add a reverse method
     * Add a slice method that returns a copy of a subset of the element of the list (eg slice(2,8) returns a new linked list containing elements #2,3,4,5,6,7
     * -- but not 8)
     **/

//    public iNode head = null;
//    public iNode tail = null;
//
//    public void add(int data){
//
//        iNode newNode = new iNode(data);
//
//        if(head == null) {
//            head = newNode;
//            tail = newNode;
//        }
//        else {
//            tail.next = newNode;
//            tail = newNode;
//        }
//    }

    public SinglyLinkedList(int data, SinglyLinkedList newNode) {
        this.data = data;
        this.next = newNode;
    }

    public void addSinglyAtFront(SinglyLinkedList newNode, SinglyLinkedList head){
        newNode.data = 10;
        newNode.next = head;
        head.next = newNode;
    }

    public void addSinglyAtEnd(SinglyLinkedList newNode, SinglyLinkedList head){
        newNode.data = 10;
        SinglyLinkedList temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public void addSinglyAtMiddle(SinglyLinkedList newNode, SinglyLinkedList head, int target){
        newNode.data = 10;
        SinglyLinkedList temp = head;
        while (temp.data != target){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
