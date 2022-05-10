import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        GenericQueue<Integer> q = new GenericQueue<Integer>();
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Enter boolean: \n");
        for (int i = 1; i <= 5; i++)
        {
            if (keyIn.nextBoolean())
                System.out.print(i + " ");
            else{
                q.enqueue(i);
                System.out.println(i + " is added to the queue");
            }


            System.out.println();
        }

        while (!q.isEmpty())
            System.out.print(q.dequeue() + " is removed!\n");

        System.out.println();
    }
}

