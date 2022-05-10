//middle element = null when removing
//case sensitive for change name

import java.util.NoSuchElementException;


public class methods<E> {
    private int size = 0;
    ANode<E> head = null;
    ANode<E> tail = null;


    public void add(E e){
        //if there's nothing in the list
        if(tail == null){
            //since there's nothing in the list,
            // we can use head and tail as the reference for the new node
            head = tail = new ANode<>(e);
        }
        //if there's already a node in the list
        else{
            tail.next = new ANode<>(e); //current tail next will point to the new node
            tail = tail.next; //point tail to the new node
        }
        size++;
        //System.out.println("Added: " + e);
    }

    public void removeElement (E e){
        ANode<E> temp = head;

        //remove from empty list
        if(size == 0 ){ //empty list
            throw new NoSuchElementException();
        }

        //remove first
        if (e.equals(head.element)) {
            head = head.next;
            size--;
        }

        //remove last
        else  if (e.equals(tail.element)) {
            for (int i = 0; i < size-2; i++) {
                temp = temp.next; //
            }
            tail = temp;
            tail.next = null;
            size--;
        }

        //remove any
//        else{
//            for(int i = 0; i < size; i++){
//                if(e.equals(temp.element)){
//                    temp.element = null; // set element = 0 to remove
//                    size--;
//                    break;
//                }
//                temp = temp.next;
//            }
//        }




    }

    public void printList(){
        ANode<E> temp = head;
        for (int i =0; i<size; i++){
            if(i == size-1){
                System.out.println(temp.element + ".");
            }
            else{
                System.out.print(temp.element + ", ");
                temp = temp.next;
            }

        }
        //System.out.println("X");
    }

    public int getSize(){
        return size;
    }

    public boolean contains (E e){
        ANode<E> temp = head;
        for(int i = 0; i < size; i++){
            if(e.equals(temp.element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void replace(E e, E newE){
        ANode<E> temp = head;
        for(int i = 0; i < size; i++){
            if(e.equals(temp.element)){
                temp.element = newE; //replace temp element with the new element
                break;
            }
            temp = temp.next;
        }
    }




}