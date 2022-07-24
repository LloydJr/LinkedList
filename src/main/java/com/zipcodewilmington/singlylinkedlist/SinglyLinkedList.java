package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    /**Must not use the LinkedList or ArrayList OR any other Java Collections
     * Must have:
     * ===add===
     * ===remove===
     * contains
     * ===find===
     * size
     * get
     * copy
     * sort
     * ===Method Definition Complete===*/

    int data;
    SinglyLinkedList next; //SinglyLinkedList == Node

    /**Add*/
    public void addSinglyAtFront(SinglyLinkedList newNode, SinglyLinkedList head){
        newNode.data = 10;
        newNode.next = head;
        head.next = newNode;
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
    public void addSinglyAtEnd(SinglyLinkedList newNode, SinglyLinkedList head){
        newNode.data = 10;
        SinglyLinkedList temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    /**Remove*/
    public void removeSinglyAtFront(SinglyLinkedList head) {
        head = head.next;
    }
    public void removeSinglyAtMiddle(SinglyLinkedList head, int target) {
        SinglyLinkedList temp = head;
        while(temp.data != target) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void removeSinglyAtEnd(SinglyLinkedList head) {
        SinglyLinkedList temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    /**Find*/
    public SinglyLinkedList find (SinglyLinkedList head, int target) {
        SinglyLinkedList temp = head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        return temp;
    }
}
