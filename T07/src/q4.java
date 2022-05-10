
public class q4 {
    public static void main(String[] args) {

        GenericQueue<Integer> X = new GenericQueue<Integer>();

        X.enqueue(new Integer(14));     //add 14 to queue X
        X.enqueue(new Integer(3));      //add 3 to queue X
        X.enqueue(new Integer(5));      // add 5 to queue X: 14,3,5

        Object Y = X.dequeue();         //remove first element from queue X and put into y

        X.enqueue(new Integer(7));      //add 7 to queue x:3,5,7
        X.enqueue(new Integer(9));      //add 9 to queue x:3,5,7,9

        Y = X.dequeue(); //Y = 3

        X.enqueue(new Integer(2));      //add 2 to queue x:5,7,9,2
        X.enqueue(new Integer(4));      //add 4 to queue x: 5,7,9,2,4

        //a)
        //X.front();
        System.out.println("First element is: " + X.front());

//        b)
        Y = X.dequeue();                //remove 5 from queue x:7,9,2,4
        X.enqueue(new Integer(10)); //x: 7,9,2,4,10
        X.front();


        //c)
        Y = X.dequeue(); //x: 9,2,4
        //d)
        X.front();
        System.out.println("First element is : " + X.front());
    }
}
