package T02Q5;

import java.util.ArrayList;

public class Duo <A, B>{
    private A first;
    private B second;

    public Duo(A a, B b){
        first = a;
        second = b;
    }

}

class Main{
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("square", 4);
        Duo<Double, Double> points = new Duo<>(5.0,24.5);
    }
}
//
//    Assume that the following objects were created
//        ArrayList<String> vehicle = new ArrayList<>();
//        ArrayList<Object> transportation = new ArrayList<>();
//        Declare a method header for generic method, allTransportation that returns nothing, which accepts
//        two ArrayList parameters using the wildcards.
//        Answer :
//public static <T> void allTransportation(ArrayList<T> list1, ArrayList<? super T> list2)
//        or
//public static <T> void allTransportation(ArrayList<? extends T> list1, ArrayList<T> list)
