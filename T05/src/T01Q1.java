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
    //method is to replace element at specific index
    public E replace(int index, E e){
        Node<E> current = head;
        E element;
        if(index < 0)
            return null;

        else if(index < 0 || index >= size) { //better to throw indexOutOfBound
            this.addLast(e);
            return null;
        }

        else{
            //stop for loop right before it reach the index
            for(int i = 0; i < index; i++){ //iterate through the list
                current = current.next; //referring to the node we want to replace, if i=1 then referring to the previous index
            }
            element = current.element;
            current.element = e;
            return element; //this return our original element
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
