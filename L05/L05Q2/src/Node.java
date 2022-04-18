public class Node <E>{

    E element;
    Node<E> next;

//    public SNode(E element, SNode<E> next) {
//        this.element = element;
//        this.next = next;
//    }

    public Node(E element){
        this.element = element;
        this.next = null;
    }
}
