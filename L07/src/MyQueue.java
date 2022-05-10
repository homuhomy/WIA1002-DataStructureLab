import java.util.LinkedList;

public class MyQueue<E> {
    LinkedList<E> QueueList;

    private E e;

    public MyQueue(E[] e){
        QueueList = new LinkedList<>();
        //enhanced for loop (E i : e)
        for(int i = 0; i < e.length; i++){
            QueueList.addLast(e[i]);
        }
    }

    public MyQueue(){
        QueueList = new LinkedList<>();
    }


    //add element to the list
    public void enqueue(E e){
        QueueList.addLast(e);
    }

    //remove first element in the list
    public E dequeue(){
        return QueueList.removeFirst();
    }


    public E getElement (int i){
        return QueueList.get(i);
    }

    public E peek(){
        return QueueList.getFirst();
    }

    public int getSize(){
        return QueueList.size();
    }
    public boolean contains(E e){
        return QueueList.contains(e);
    }
    public boolean isEmpty(){
        return QueueList.isEmpty();
    }

    public String tostring(){
        return QueueList.toString();
    }
}