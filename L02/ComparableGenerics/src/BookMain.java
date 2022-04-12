import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List <Book> bookList = new ArrayList<>();

        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String bookTitle = userInput.nextLine();

            if(bookTitle.isEmpty()){
                System.out.println(bookList.size() + " books in total.");

                //test only
                System.out.println("Before compare and sort:");
                for(Book bl: bookList){
                    System.out.println(bl);
                }

                System.out.println("Books: ");

                Comparator<Book> comparator = Comparator.comparing(Book::getAgeRec)
                        .thenComparing(Book::getBookTitle);

                Collections.sort(bookList, comparator);
                System.out.println("\n");

                System.out.println("After compare and sorted:");
                for(Book bl: bookList){
                    System.out.println(bl);
                }
                break;

            }

            System.out.println("Input the age recommendation: ");
            int ageRec = Integer.valueOf(userInput.nextLine());

            bookList.add(new Book(bookTitle, ageRec));
        }

    }

}
