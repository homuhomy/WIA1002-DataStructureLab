package L04Q1;

public class TestLinkedList {
    public static void main(String[] args) {

        MyLinkedList<Character> list = new MyLinkedList<>();

        //a. append the following
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');


        //b.print all elements in the list
        list.print();
        System.out.println();

        //c. Reverse all the elements in the list.
        list.reverse();
        System.out.println();

        //d. Retrieve the number of elements in the list.
        System.out.println("Size is: " + list.getSize());
        //System.out.println(list.getSize());
        System.out.println();

        //e. Retrieve the first and last value.
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println();

        //f. Delete the middle value.
        System.out.println(list.get(list.getSize()/2) + " will be removed");
        list.remove(list.getSize()/2);

        //g. Retrieve the index location for the second and third value.
        System.out.println("Index of 2nd and 3rd value: " + list.indexOf('b') + " and " + list.indexOf('c'));

        //h. Checks if the list has the value ‘c’.
        //System.out.println(list.contains('c'));
        //System.out.println("Current size: " + list.getSize());

        //i. Replace the items individually with the following: h,e,l,l,o.
        list.set(0, 'h');
        list.set(1, 'e');
        list.set(2, 'l');
        list.set(3, 'l');
        list.set(4, 'o');

        System.out.println("Current size: " + list.getSize());
        list.print();

    }
}
