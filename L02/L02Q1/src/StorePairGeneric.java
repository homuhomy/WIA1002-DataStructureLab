public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>>{
    private E first, second;

    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    //Override the Object equals() method in the StorePair class to compare the
    //first values of two objects for equality.
    @Override
    public boolean equals(Object o){
        StorePairGeneric<E> other = (StorePairGeneric<E>) o;
        return this.first.equals(other.first);
    }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    //compare the first values of two objects
    @Override
    public int compareTo(StorePairGeneric<E> o){
        return this.first.compareTo(o.first);
    }

    //create test program that creates 3 objects of the StorePairGeneric class
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        System.out.println(a.compareTo(b)); //a > b, it returns 1
        System.out.println(a.compareTo(c)); //a == c, it returns 0
        System.out.println(b.compareTo(c)); //b < c, it returns -1

        System.out.println(a.equals(b)); //return false
        System.out.println(a.equals(c)); //return true
        System.out.println(b.equals(c)); //return false
    }
}

////example
//
//    @Override
//    public int compareTo(Member member) {
//        if (this.height == member.getHeight()) {
//            return 0;
//        } else if (this.height > member.getHeight()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
//
//    //also same
//
//    @Override
//    public int compareTo(Member member) {
//        return this.height - member.getHeight();
//    }