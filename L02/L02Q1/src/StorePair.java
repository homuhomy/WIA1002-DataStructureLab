public class StorePair <E extends Comparable<E>>{
    private E first, second;

    public StorePair(E first, E second) {
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
    public boolean equals(Object o){
        StorePair<E> other = (StorePair<E>) o;
        return this.first.equals(other.first);
    }

    public String toString() {
        return "first = " + first + " second = " + second;
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