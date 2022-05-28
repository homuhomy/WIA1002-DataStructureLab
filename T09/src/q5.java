public class q5 {
    public static void main(String[] args) {
        printDigit(4567);
    }

    public static void printDigit(int n){
        int digit = n%10;
        if(n == 0)
            return;
        else{
            printDigit(n/10);
            System.out.print(digit+" ");
        }
    }
}
