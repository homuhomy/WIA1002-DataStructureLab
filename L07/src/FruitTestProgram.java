public class FruitTestProgram {
    public static void main(String[] args) {

        String[] fruits ={"Durian", "Bluebery"};
        MyQueue <String> fruitQ =new MyQueue<String>(fruits);

        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        System.out.println(fruitQ.tostring());

        System.out.println("The first element in the list is " + fruitQ.peek());
        System.out.println("The size of the list is " + fruitQ.getSize());
        System.out.println(fruitQ.dequeue() + " is deleted.");
        System.out.println(fruitQ.tostring());
        System.out.println("The item in index 2 is " + fruitQ.getElement(2));
        System.out.println("Does fruitQ contains Cherry? " + fruitQ.contains("Cherry"));
        System.out.println("Does fruitQ contains Durian? " + fruitQ.contains("Durian"));
        System.out.println("Is fruitQ empty? " + fruitQ.isEmpty());

    }
}
