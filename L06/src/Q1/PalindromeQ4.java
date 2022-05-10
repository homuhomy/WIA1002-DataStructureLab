package Q1;


import java.util.Scanner;

/*Q4
        A string is a palindrome if it spells the same way forwards and backwards.
        Write a Java program that uses a Stack to determine
        if a string is a palindrome or not.
        Let your string be of maximum size 15 characters.
        Note however that the actual size  may be 15 or less.

        */
public class PalindromeQ4 {
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        MyStack<Character> palindromeStack = new MyStack<>();

        System.out.println("Enter a word: ");
        String  wordCheck = s.nextLine();

        //check if the word is more than 15 characters or not
        if(wordCheck.length()<=15){
            //then push to stack
            for (int i = 0; i < wordCheck.length(); i++) {
                palindromeStack.push(wordCheck.charAt(i));
            }

            String reverseInput = "";
        }
        else{
            System.out.println("Word is more than 15 characters! Please re-enter value: ");
        }




    }
}