package SList;

import java.util.NoSuchElementException;

public class SList <E>{
    SNode<E> head = null;
    SNode<E> tail = null;
    private int size = 0;

    //Append a new element at the end of the list.
    public void appendEnd(E e){
        if(tail==null){ //if theres nothing in list
            head = tail = new SNode<E>(e); //point head and tail to new node
        }
        else{
            tail.next = new SNode<>(e); //refer the current last node next node to the new node
            tail = tail.next; //refer tail to the new node
        }
        size++; //increase size of linked list by 1
        System.out.println("Added: " + e);
    }

    //eliminate the first element in the list
    public E removeInitial(){
        if(head == null){ //empty list
            throw new NoSuchElementException();
        }
        else{
            SNode<E> temp = head; //create a new node temp and we refer to head as the starting point
            head = head.next; //refer head to the next node so now nothing can refer to the deleted node
            if(head == null){ //size == 0
                tail = null;
            }
            size--;
            System.out.println(temp.element + " was removed.");
            return temp.element;
        }
    }

    //Search for an element and returns true if this list contains the searched element
    public boolean contains(E e){
        SNode<E> temp = head;
        //search through the list
        for(int i = 0; i < size; i++){
            if(e.equals(temp.element)){
                return true; //meaning we found the element that we are looking for
            }
            temp = temp.next;
        }
        return false; //list doesnt contain the element
    }

    //Empty all elements in the list and return a statement that reports that the list is empty.
    public void clear(){
        size = 0;
        tail = head = null;
        System.out.println("The list is empty.");
    }

    //Display all values from the list in a successive order.
    public void display(){
        System.out.println("Printing the list: ");
        SNode<E> temp = head;
        for(int i = 0; i < size; i++){
            System.out.print(temp.element);
            temp = temp.next;
        }
    }
}
