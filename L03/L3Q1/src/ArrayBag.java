import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayBag<T> implements BagInterface<T> {
    private static final int DEFAULT_CAPACITY = 25;
    private T[] bag;
    private int numberOfEntries;

    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayBag(int capacity){
        bag = (T[]) new Object[capacity];
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull()) {
            return false;
        }else{
            bag[numberOfEntries++] = newEntry;
            return true;
        }
    }

    @Override
    public T remove() {
        T result = removeEntry(numberOfEntries - 1);
        return result;
    }

    /**
     * Removes and returns the entry at a given index within the array
     * @param givenIndex the index of the entry to be removed
     * @return the entry if the removal was successful, or null if not
     */
    private T removeEntry(int givenIndex){
        T result = null;

        if(!isEmpty() && (givenIndex >= 0)){
            result = bag[givenIndex]; //eentry to removee
            numberOfEntries--;

            //replace entry to remove with last entry
            bag[givenIndex] = bag[numberOfEntries];
            bag[numberOfEntries] = null; //remove reference to last entry
        }
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        if (numberOfEntries != 0) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (bag[i] == anEntry) {
                    bag[i] = null;

                    for (int j = i; j < numberOfEntries; j++) {
                        bag[j] = bag[j + 1];
                    }

                    numberOfEntries--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(bag, null);
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int freq = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry == bag[i]) {
                freq++;
            }
        }
        return freq;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i] == anEntry) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] resultArr = (T[]) new Object[numberOfEntries];
        //System.arraycopy(bag, 0, resultArr, 0, numberOfEntries);

        for(int index = 0; index < numberOfEntries; index++){
            resultArr[index] = bag[index];
        }
        return resultArr;
    }

    public static void main(String args[]) {
        ArrayBag<String> a = new ArrayBag();
        a.add("apple");
        a.add("apple");
        a.add("banana");
        a.remove();
        System.out.println(a.contains("apple"));
        System.out.println(a.getFrequencyOf("apple"));
        System.out.println(Array.get(a.toArray(), 0));
        System.out.println(Arrays.toString(a.toArray()));
    }
}
