public class minMaxClass {
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        String intStr = minmax(intArray);
        System.out.println(intStr);

        String strStr = minmax(strArray);
        System.out.println(strStr);
    }

    public static<E extends Comparable<E>> String minmax(E[] item){
        E min = item[0];
        E max = item[0];

        for(int i=0; i<item.length; i++) {
            if(min.compareTo(item[i])>0) //meaning current min is larger than current item
                min = item[i];
            if(max.compareTo(item[i])<0) //meaning current max is smaller than current item
                max = item[i];
        }
        return "Min = " + min + " Max = " + max;
    }

}
