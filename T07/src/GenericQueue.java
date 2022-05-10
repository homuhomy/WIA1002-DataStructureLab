import java.util.LinkedList;

public class GenericQueue <E>{
    LinkedList<E> list = new LinkedList<>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public E front(){
        return list.get(getSize()-getSize());            //5-4 (size -(size-1))
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}
