import java.util.NoSuchElementException;

//try making this without referring to lecture's
public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    DoublyLinkedList(){
        size = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void iterateForward(){
        System.out.println("Iterating forward: ");
        Node<E> temp = head; //set head as starting point
        while(temp!=null){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
    }

    public void iterateBackward(){
        System.out.println("Iterating backward: ");
        Node<E> temp = tail; //set tail as starting point
        while(temp!=null){
            System.out.print(temp.element + " ");
            temp = temp.prev;
        }
    }

    public void addFirst(E element){
        Node<E> temp = new Node<>(element, head, null); //create obj temp and set pointer to the new node
        if(head != null){
            head.prev = temp; //set head.prev of current head to be linked to the new node
        }
        head = temp; //temp is now the first node
        if(tail == null){
            tail = temp;
        }
        size++;
        System.out.println("Adding: " + element);
    }

    public void addLast(E element){
        Node<E> temp = new Node<>(element, null, tail); //create obj temp and set pointer to tail
        if(tail != null){ //if there's something in the list
            tail.next = temp; //current tail will point to the new node
        }
        tail = temp;
        if(head == null)
            head = temp; //if no head, them set temp as head
        size++;
        System.out.println("Adding: " + element);
    }

    public void add(int index, E element){
        //index can only be 0 ~ size()
        if(index < 0 || index > size){ //not possible index
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            addFirst(element);
        }
        else if(index == size){
            addLast(element);
        }
        else{
            /* set from head and begin traverse
                        stop on required position */
            Node<E> temp = head;
            for(int i = 0; i < index; i++){ //iterate and stop before the index chosen
                temp = temp.next; //go forward
            }
            //imagine dia swap places dgn previous node
            Node<E> insert = new Node(element, temp, temp.prev);
            //for now, temp.prev.next is pointing to temp, so now we want it to point to newNode
            temp.prev.next = insert;
            //set pointer 'prev' of the node temp to new node insert
            temp.prev = insert;
            size++;
            System.out.println("Adding: " + element);
        }
    }

    public E removeFirst(){
        if(size==0){ //empty link list
            throw new NoSuchElementException();
        }
        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        size--;

        System.out.println("Deleted: " + temp.element);
        return temp.element; //return element that have been removed
    }

    public E removeLast(){
        if(size==0){ //empty link list
            throw new NoSuchElementException();
        }
        Node<E> temp = tail;
        tail = tail.prev; //point tail to the previous node
        tail.next = null; //now the node we want to remove will be null
        size--;

        System.out.println("Deleted: " + temp.element);
        return temp.element;
    }

    public E remove(int index){
        E element = null;
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        else if(index == 0){
            element = removeFirst();
        }
        else if(index == size-1){
            element = removeLast();
        }
        else{
            Node<E> temp = head; //as starting point
            for(int i = 0; i < index; i++){ //in this case it will stop at the node wanna remove
                temp = temp.next; //going forward
            }
            element = temp.element; //temporarily store element we want to return

            //prev referring to the prev variable of the next node after index 2, namely the node at index 3
            temp.next.prev = temp.prev;

            //next here is referring to the next variable of the prev node before index 2, namely, the node at index 1
            temp.prev.next = temp.next;
            temp.prev = temp.next = null;
            size--;
            System.out.println("Deleted: " + temp.element);
        }
        return element;
    }

    public void clear(){
        Node<E> temp = head;
        while(head!= null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
    }

    public E xyz(int index, E e){
        Node<E> current = head;
        Node<E> temp;

        if(index < 0 || index > size){ //not possible index
            throw new IndexOutOfBoundsException();
        }
        else if(index == size -1){ //if new node is to be added as the last node
            this.addLast(e);
            return null;
        }
        //addFirst
        else if(index == 0){ //want to add new node at the first element
            temp = head; //point head to temp (new node)
            head.element = e; //head element now has the value of e
            return temp.element; //return the temp element
        }
        else{
            //stop for loop right before it reach the index
            for(int i = 0; i < index; i++){ //iterate through the list i=1?
                current = current.next; //going forward
            }
            //temp = our new node //current = node located in previous index
            temp = new Node<>(e,current,current.prev);
            temp = current.next;
            current.next.element=e; //what if we just do temp.element = e?

            size++; //increase size
            return temp.element;

        }
    }


}
