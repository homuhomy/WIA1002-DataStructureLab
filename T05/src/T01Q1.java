public class T01Q1 <E>{
    private Node<E> head = null;
    private Node<E> tail = null;
    int size = 0;

//    public T01Q1(){
//        size = 0;
//        this.head = null;
//        this.tail = null;
//    }

    //q1
    //method should be called add
//    public E xyz(int index, E e){
//        Node<E> current = head;
//        Node<E> temp;
//
//        if(index < 0) //indexOutOfBound
//            return null;
//        else if(index == size -1){ //if new node is to be added as the last node
//            this.addLast(e);
//            return null;
//        }
//        //addFirst
//        else if(index == 0){ //want to add new node at the first element
//            temp = head; //point head to temp (new node)
//            head.element = e; //head element now has the value of e
//            return temp.element; //return the temp element
//        }
//        else{
//            //stop for loop right before it reach the index
//            for(int i = 1; i < index; i++){ //iterate through the list i=1?
//                current = current.next; //going forward
//            }
//            //temp = our new node //current = node located in previous index
//            temp = current.next;
//            current.next.element = e; //what if we just do temp.element = e?
//            return temp.element;
//        }
//    }

    //q1 c
    //make a method called addFirst(E element)
    public void addFirst(E element){
        Node<E> temp = new Node<>(element, head, null);
        if(head!=null)
            head.prev = temp;
        head = temp;
        if(tail == null)
            tail = temp;
        size++;
    }

    //new add method
    public void add(int index, E e){
        if(index < 0 || index > size) //update the condition
            throw new IndexOutOfBoundsException();
        if(index == size)
            addLast(e);
        if(index == 0)
            addFirst(e);
    }

    //new
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

    public void addLast(E element){
        Node<E> temp = new Node<>(element, null, tail); //create obj temp and set pointer to tail
        if(tail != null){ //if there's something in the list
            tail.next = temp; //current tail will point to the new node
        }
        tail = temp;
        if(head == null)
            head = temp; //if no head, them set temp as head
        size++;
        System.out.println("Added: " + element);
    }


}
