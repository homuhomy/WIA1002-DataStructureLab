public class StudentSystem <E>{
    private int size = 0;
    Node<E> head = null;
    Node<E> tail = null;

    public void add(E e){
        Node<E> newNode = new Node<>(e);
        if(size == 0){ //if theres nothing in list
            head = tail = newNode;
        }
        //else it will just do like addLast
        else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        //System.out.println(e + " was added.");
    }

    public void removeElement(E e){
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(e.equals(current.element)){
                //idk how
                size--;
            }
            current = current.next;
        }
    }

    public void printList(){
        System.out.println("You have printed the following students' name: ");
        Node<E> temp = head;
        for(int i = 0; i < size; i++){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean contains(E e){
        Node<E> temp = head;
        for(int i = 0; i < size; i++){
            if(e.equals(temp.element)){
                return true;
            }
        }
        return false;
    }

    public void replace(E e, E newE){
        Node<E> temp = head;
        for(int i = 0; i < size; i++){
            if(e.equals(temp.element)){
                temp.element = newE; //replace temp element with the new element
                break;
            }
            temp = temp.next;
        }
    }


}
