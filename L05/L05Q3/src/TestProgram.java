public class TestProgram {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addFirst(1);
        list.add(1,10);
        list.addLast(100);
        list.add(2,2);
        list.remove(3);

        System.out.println("");

        list.iterateForward();
        System.out.println();
        list.iterateBackward();

        System.out.println();
        System.out.println("size of current Doubly linked list: " + list.size());
        int temp = list.size();
        list.clear();
        System.out.println("Succesfully clear " + temp + " node(s)");
        System.out.println("size of current Doubly linked list: " + list.size());
    }
}
