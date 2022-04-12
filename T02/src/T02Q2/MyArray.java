package T02Q2;

public class MyArray {
    public static void main(String[] args) {
        Integer[] number = {1,2,3,4,5};
        String[] name = {"Jane", "Tom", "Bob"};
        Character[] alphabet = {'a', 'b', 'c'};

        MyArray.listAll(number);
        MyArray.listAll(name);
        MyArray.listAll(alphabet);

    }

    //generic method listAll that displays the list of arrays
    public static <E> void listAll(E[] list){
        for(int i =0; i<list.length; i++){
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }
}
