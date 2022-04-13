public class MinMaxTwoDArray {
    public static void main(String[] args) {
        //create an object of 2D array for integers
        Integer[][] numbers = { {4, 5, 6}, {1, 2, 3} };

        //test the min and max generic methods
        System.out.println(min(numbers));
        System.out.println(max(numbers));
    }
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (min.compareTo(list[i][j]) > 0) { //meaning current min is larger than current item
                    min = list[i][j];
                }
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (max.compareTo(list[i][j]) < 0) { //meaning current max is smaller than current item
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}
