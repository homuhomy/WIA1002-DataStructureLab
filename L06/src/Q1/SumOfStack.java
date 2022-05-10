package Q1;

import java.util.Scanner;

public class SumOfStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyStack<Integer> S = new MyStack<>();

        // a) Prompt user to enter an integer value.
        System.out.println("Enter number of elements to put into the stack: ");
        int userInt = s.nextInt();

        // b) Push the values 1 through the user entered value onto the stack.
        //find the sum of every element in S
        int sum = 0;
        for (int i = 1; i <= userInt; i++) {
            S.push(i);
            sum += i;
        }

        // c) Print the stack and size of the stack.
        System.out.println(S);
        System.out.println("Size of stack: " + S.getSize());
        System.out.println("Sum of Stack: " + sum);


        //find the sum of every element in S



    }
}