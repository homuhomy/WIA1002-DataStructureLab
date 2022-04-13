

public class FindMax {
    public static void main(String[] args) {
        //create 3 diff objects of type array for int
        Integer[] numbers = {1,2,3};
        String[] colors = {"red", "green", "blue"};
        Circle[] radiusArray = {new Circle(3.0), new Circle(2.9), new Circle(5.9)};

        System.out.println(max(numbers));
        System.out.println(max(colors));
        System.out.println(max(radiusArray));
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0]; //assume it's the max

        for(int i = 1; i<list.length; i++){
            if(max.compareTo(list[i]) < 0){
                max = list[i];
            }
        }
        return max;
    }

    static class Circle implements Comparable<Circle>{
        private double radius;

        public Circle(Double radius){
            this.radius = radius;
        }

        @Override
        public int compareTo(Circle c) {
            if(this.radius < c.radius){
                return -1;
            }
            else if(this.radius == c.radius){
                return 0;
            }
            return 1;
        }


    }

}
