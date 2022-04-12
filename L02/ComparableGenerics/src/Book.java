

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author homu
 */
public class Book {
    private String bookTitle;
    private int ageRec;

    public Book(String bookTitle, int ageRec){
        this.bookTitle = bookTitle;
        this.ageRec = ageRec;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getAgeRec() {
        return ageRec;
    }

    public void setAgeRec(int ageRec) {
        this.ageRec = ageRec;
    }

    @Override
    public String toString() {
        return this.getBookTitle() + "(recommended for " + this.getAgeRec() + " year-olds or older)";
    }



}
