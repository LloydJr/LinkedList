package com.zipcodewilmington.singlylinkedlist;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    /**Must not use the LinkedList or ArrayList OR any other Java Collections
     * Must have:
     * ===add===
     * ===remove===
     * ===contains===
     * ===find===
     * ===size===
     * ===get===
     * ===copy===
     * ===sort===
     * ===Method Definition Complete===*/

    Integer data;
    SinglyLinkedList next; //SinglyLinkedList == Node

    public SinglyLinkedList(int data, SinglyLinkedList newNode) {
        this.data = data;
        this.next = newNode;
    }

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
    public Boolean contains(SinglyLinkedList valueToContain) {
        if (next == null) return false;
        else return next.contains(valueToContain);
    }
    /**Find*/
    public SinglyLinkedList find (SinglyLinkedList head, int target) {
        SinglyLinkedList temp = head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        return temp;
    }
    /**Size*/
    public Integer size (SinglyLinkedList head) {
        SinglyLinkedList temp = head;
        Integer count = 0;
        while (temp != null) {
            count++; temp = temp.next;
        }
        return count;
    }
    /**Get*/
    public SinglyLinkedList get () {
        return this.next;
    }
    /**Copy*/
    public SinglyLinkedList copy (SinglyLinkedList head) {
        SinglyLinkedList temp = head;
        SinglyLinkedList newNode = null;
        SinglyLinkedList tail = null;

        while (temp != null) {
            if (newNode == null) {
                newNode = new SinglyLinkedList(temp.data, newNode);
                tail = newNode;
            }
            else {
                tail.next = new SinglyLinkedList(temp.data, tail.next);
                tail = tail.next;
            }
        }
        return newNode;
    }
    /**Sort*/
    public void sort (SinglyLinkedList head) {
        SinglyLinkedList current = head, index = null;
        Integer temp;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
}
