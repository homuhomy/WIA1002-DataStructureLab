import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueueComparator pqc=new PriorityQueueComparator();
        PriorityQueue<String> pq=new PriorityQueue<String>(5,pqc);

        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");

        for(String s:pq){
            System.out.println(s);
        }

//        for(int s = 0; s < pq.size() ; s++){
//
//        }

//        for(dataType item : array) {
//    ...
//        }

//        array - an array or a collection
//        item - each item of array/collection is assigned to this variable
//        dataType - the data type of the array/collection

    }
}

