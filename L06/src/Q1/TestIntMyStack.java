package Q1;

//QUESTION 2
import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        MyStack<Integer> intStack = new MyStack<>();

        // a) Prompt user to enter an integer value.
        System.out.println("Enter number of elements to put into the stack: " );
        int userInt = s.nextInt();

        // b) Push the values 1 through the user entered value onto the stack.
        for (int i = 1; i<=userInt; i++){
            intStack.push(i);
        }

        // c) Print the stack and size of the stack.
        System.out.println(intStack);
        System.out.println("Size of stack: " + intStack.getSize());

        // d) Display the contents of the stack by repeatedly calling pop() until the stack is empty
        for (int i = userInt; userInt>0; i--){
            if(i==0){
                break;
            } else {
                intStack.pop();
                System.out.println(intStack);
            }

        }

    }
}