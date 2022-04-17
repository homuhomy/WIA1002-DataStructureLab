package L04Q1;

public class Node <E>{
    /**
     * Write the generic Node class consisting of two components of a node
     * (i.e.: element, next), with a default construct
     * and a constructor that accepts an
     * item assigned to the initially declared element variable.
     */

    E element;
    Node<E> next;

    public Node(){};

    public Node(E element){
        this.element = element;
    }

}
