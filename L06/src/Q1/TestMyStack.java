package Q1;

public class TestMyStack {
    public static void main(String[] args) {

        //create a stack for char
        MyStack<Character> characterMyStack = new MyStack<>();

        //q1)b)
        //1) Following the given order, add elements, a b and c in the stack.
        characterMyStack.push('a');
        characterMyStack.push('b');
        characterMyStack.push('c');

        //2) Print the stack.
        System.out.println(characterMyStack);

        //3) Check if element ‘b’ is in the stack.
        //System.out.println();
        System.out.println("'b' is in the stack: " + characterMyStack.search('b'));

        //4) Check if element ‘k’ is in the stack.
        //System.out.println();
        System.out.println("'k' is in the stack: " + characterMyStack.search('k'));


        //create new stack for int
        MyStack<Integer> integerMyStack = new MyStack<>();

        //add elements to the stack
        integerMyStack.push(1);
        integerMyStack.push(2);
        integerMyStack.push(3);

        //print out the int stack
        System.out.println();
        System.out.println(integerMyStack);

        //check if element '6' is in the stack
        System.out.println();
        System.out.println("'6' is in the stack: " + integerMyStack.search(6));

    }
}
