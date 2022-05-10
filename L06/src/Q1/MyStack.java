package Q1;

import java.util.ArrayList;

public class MyStack <E>{
    ArrayList<E> list = new ArrayList<>();

    //add object to the stack
    public void push(E object){
        list.add(object);
    }

    //remove latest object in stack
    public E pop() {
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    //view latest object in stack
    public E peek(){
        return list.get(getSize()-1);
    }

    //return size or list
    public int getSize(){
        return list.size();
    }

    //return if the list is empty or not tru or false
    public boolean isEmpty(){
        return list.isEmpty();
    }

    //if we dont have this method, it will print the memory address
    public String toString(){
        return "stack: " + list.toString();
    }

    public boolean search(E o){
        return list.contains(o);
    }
}
