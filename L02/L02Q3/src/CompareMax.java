/*
        create a generic static method called maximum where the generic
        type extends the Comparable interface, which receives three parameters.
        Find the maximum of
        three values invoked by the main method.
 */

public class CompareMax {
    public static<T extends Comparable<T>> T maximum(T o1, T o2, T o3){
        T max = o1; // assume x is initially the largest
        if ( o2.compareTo( max ) > 0 ){
            max = o2; // o2 is the largest so far
        }
        if ( o3.compareTo( max ) > 0 ){
            max = o3; // o3 is the largest now
        }
        return max; // returns the largest object
    }

    public static void main(String[] args) {
        System.out.printf( "Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );
        System.out.printf( "Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );
    }
}
