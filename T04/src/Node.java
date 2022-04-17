//public class Node <E>{
//    Node<Character> node1 = new Node<>('a');
//    Node<Character> node2 = new Node<>('z');
//
//    int size = 2;
//
//    Node<Character> head = node1;
//    Node<Character> tail = node2;
//
//
//    public void addFirst(E e){
//        Node<E> newNode = new org.w3c.dom.Node<>(e);
//        newNode.next = head; //create pointer to current head
//        head = newNode; //new node created & assigned to new head node
//        size++; //increase list size
//        if(tail == null) //if no node exist
//            tail = head; //set tail as head
//    }
//
//    public void addLast(E e){
//        if(tail == null) //no node exist
//            head = tail = new Node<>(e); //set new node as head and tail
//        else{
//            tail.next = new Node<>(e); //tail.next point to new Node
//            tail = tail.next; //new tail updated from tail.next
//        }
//        size++; //increase list size
//    }
//
//    public void add(int index, E e){
//        if(index == 0) addFirst(e);
//        else if(index == size -1) addLast(e);
//        else{
//            Node<E> current = head; //set head to be a current node
//            //if index = 0; i < index - 1
//            for(int i = 1; i < index; i++) //traverse & stop BEFORE requested index
//                current = current.next;
//            Node<E> temp = current.next; // hold a reference for current.next
//            current.next = new Node<>(e); //current.next point to new node
//            (current.next).next = temp; //get the reference from temp
//            size++;
//        }
//    }
//
//    public E removeFirst(){
//        if (size == 0) return null; //no node exist
//        else{
//            Node<E> temp = head; //copy head to temp node before delete
//            head = head.next; //set new head
//            size--; //reduce size
//            if(head == null) tail = null;
//            return temp.element; //to know what we remove
//        }
//    }
//
//    public E removeLast(){
//        if(size == 0) return null; //no node exist
//        else if(size ==1){ //only 1 node exist
//            Node<E> temp = head; //point to the only element
//            head = tail = null; //reset
//            size = 0;
//            return temp.element;
//        } else{
//            Node<E> current = head;
//            for(int i = 0; i < size-2; i++){ //stop 1 node before tail
//                current = current.next;
//            }
//            Node<E> temp = tail; //copy tail to temp before delete
//            tail = current; //current become tail
//            tail.next = null; //remove tail.next
//            size--;
//            return temp.element;
//        }
//    }
//
//    public E remove(int index){
//        if(index<0 || index >= size)  return null; //delete index of node in range
//        else if(index == 0) return removeFirst();
//        else if(index == size-1) return removeLast();
//        else{
//            Node<E> previous = head; //set head to previous
//            for(int i = 1; i<index; i++){ //stop before the node we want to remove
//                previous = previous.next;
//            }
//            Node<E> current = previous.next; //create new node Current which pointing to the node we wanna delete
//            previous.next = current.next; //set new point from previous.next to current.next, so there's nothing to reference current
//            size--;
//            return current.element;
//        }
//    }
//
//    //question2
//    public boolean contain(E e) {
//        Node<E> pointerB = head; //start from the first node
//        for(int i =0; i<size; i++) {
//            if(e.equals(pointerB.element)){
//                return true; //return true if pointerB is equal to e
//            }
//            pointerB.next = pointerB;
//        }
//        return false; //the list doesnt contain the element
//        }
//
//}
