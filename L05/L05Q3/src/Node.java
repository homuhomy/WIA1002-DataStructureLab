public class Node <E>{
    E element;
    Node<E> next, prev;

    public Node(E element){
        this(element, null, null);
    }

    public Node(E element, Node next, Node previous){
        this.element = element;
        this.next = next;
        this.prev = previous;
    }


}
