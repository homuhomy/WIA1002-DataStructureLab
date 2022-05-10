import java.util.*;
import java.util.Iterator;

public class t7bq3 {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");

        System.out.println("peek() gives us: "+ pQueue.peek()); //(a) will print "C++"
        System.out.println("The queue elements:");
        //(b)
//        C++
//        Fortran
//        Java
//        Python
        Iterator itr = pQueue.iterator();


        System.out.println("Print after iterated: ");
        while (itr.hasNext())
            System.out.println(itr.next()); //(b)

        System.out.println(pQueue);

        System.out.println("\n");
        pQueue.poll();              //remove first element

        System.out.println("After poll():"); //(c)

        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next()); //(c)

        pQueue.remove("Java");

        //override  itr2
        System.out.println("\nAfter remove():"); //(d)
        Iterator<String> itr3 = pQueue.iterator();

        while (itr3.hasNext())
            System.out.println(itr3.next()); //(d)

//        System.out.println("ITR2: ");
//        while(itr2.hasNext())
//            System.out.println(itr2.next());

        boolean b = pQueue.contains("Ruby");

        System.out.println ( "Priority queue contains Ruby or not?: " + b); //(e)
        Object[] arr = pQueue.toArray();

        System.out.println ( "Value in array: "); //(f)

        for (int i = 0; i<arr.length; i++)
            System.out.println ( "Value: " + arr[i].toString()) ; //(f)
    }
}
