package L04Q1;

public class MyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public MyLinkedList() {
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head; //create pointer to current head
        head = newNode; //new node created & assigned to new head node
        size++; //increase list size
        if (tail == null) //if no node exist before
            tail = head; //set tail as head
    }

    public void addLast(E e) {
        if (tail == null) //no node exist
            head = tail = new Node<>(e); //set new node as head and tail
        else {
            tail.next = new Node<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }
        size++; //increase list size
    }


    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> current = head; //set head to be a current node
            //if index = 0; i < index - 1
            for (int i = 1; i < index; i++) //traverse & stop BEFORE requested index
                current = current.next;
            //temp so we hold the value and didnt lose the node
            Node<E> temp = current.next; // hold a reference for current.next
            current.next = new Node<>(e); //current.next point to new node
            (current.next).next = temp; //get the reference from temp
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0){
            return null; //no node exist
        }
        else {
            Node<E> temp = head; //copy head to temp node before delete
            head = head.next; //set new head
            size--; //reduce size
            if (head == null) //mean size == 0
                tail = null;
            return temp.element; //to know what we remove
        }
    }

    public E removeLast() {
        if (size == 0) return null; //no node exist
        else if (size == 1) { //only 1 node exist
            Node<E> temp = head; //point to the only element
            head = tail = null; //reset
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) { //stop 1 node before tail
                current = current.next;
            }
            Node<E> temp = tail; //copy tail to temp before delete
            tail = current; //current become tail
            tail.next = null; //remove tail.next
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null; //delete index of node in range
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1) {
            return removeLast();
        }
        else {
            Node<E> previous = head; //set head to previous
            for (int i = 1; i < index; i++) { //stop before the node we want to remove
                previous = previous.next;
            }
            Node<E> current = previous.next; //create new node Current which pointing to the node we wanna delete
            previous.next = current.next; //set new point from previous.next to current.next, so there's nothing to reference current
            size--;
            return current.element;
        }
    }

    /**
     * Return nothing, but adds an element to the list
     * @param e
     */
    public void add(E e){
        if(size == 0){ //node is empty
            addFirst(e);
        }
        else{
            addLast(e);
        }
    }

    /**
     * Return true if list contains the element e
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node<E> current = head; //start from the first node
        for (int i = 0; i < size; i++) {
            if (e.equals(current.element)) {
                return true; //return true if current is equal to e
            }
            current.next = current;
        }
        return false; //the list doesnt contain the element
    }

    /**
     *
     * @param index
     * @return Return element at the specified index
     */
    public E get(int index){
        Node<E> current = head; //set as starting point at head

        for(int i =0; i<index; i++){
            current = current.next;
        }
        return current.element;
    }

    /**
     *
     * @return Return the value of the first item
     */
    public E getFirst(){
        return head.element;
    }

    /**
     *
     * @return Return the value of the last item
     */
    public E getLast(){
        return tail.element;
    }

    /**
     *
     * @param e
     * @return Return the index of the head matching element in this list
     *
     * @return -1 of no match
     */
    public int indexOf(E e){
        Node<E> current = head; //as starting point

        for(int i = 0; i < size; i++){
            if (e.equals(current.element)) {
                return i; //return index of the matching element
            }
            current = current.next; //keep finding the matching element
        }
        return -1;
    }




    //2 3 3 4 5 6 6 3
    /**
     *
     * @param e
     * @return index of the last matching element in this list
     * Return -1 if no match
     */
    public int lastIndexOf(E e){
        int lastIndex = -1;
        Node<E> current = head; //as starting point

        for(int i = 0; i <size; i++){
            if(e.equals(current.element)){
                lastIndex = i;
            }
            current = current.next;
        }
        return lastIndex;
    }


    /**
     * Replace the element at the specified position in this list with the specified element
     * @param index
     * @param e
     * @return specified element
     */
    public E set(int index, E e){
        if(index == size){ //meaning out of bound
            addLast(e);
            return remove(index + 1);
        }
        add(index, e);
        return remove(index + 1);
    }

//    public E set(int index, E e){
//        if(index < 0 || index > size - 1){
//            return null;
//        }
//
//        if(index == size){
//            addLast(e);
//        }
//
//        Node<E> current = head;
//        for(int i = 0; i < index; i++){
//            current = current.next;
//        }
//
//        E temp = current.element; //save the value of current to temp so that it can be return later
//        current.element = e; //assign new element to the current element
//        return temp; //return replaced element
//    }

    //clear the list
    public void clear(){
        while(size!=0){
            removeFirst();
        }

        //or
        //size = 0;
        // head = tail = null;
    }

    //Print all the elements in the list
    public void print(){
        Node<E> current = head; //as starting point
        for(int i = 0; i < size; i++){
            System.out.println(current.element + " ");
            current = current.next;
        }
    }

    //Print all elements in reverse order
    public void reverse(){
        String s = " ";
        for(Node<E> current = head; current != null; current = current.next)
            s = current.element + " " + s;
        System.out.println(s);
    }

    public int getSize(){
        return size;
    }

    public E getMiddleValue(){
        return get((size - 1) / 2);
    }

}
