package t18;

import java.util.List;
import java.util.ArrayList;

public class Recomendation implements Prototype{
    private String targetAudience;
    private List<Book> books;

    public Recomendation(String targetAudience, List<Book> books) {
        this.targetAudience = targetAudience;
        this.books = books;
    }

   @Override
    public Recomendation clone() {
        List<Book> copiedBooks = new ArrayList<>();
        for (Book book : this.books) {
            copiedBooks.add(book.clone()); // requires Book to implement clone()
        }
        return new Recomendation(this.targetAudience, copiedBooks);
    }

    @Override
    public String toString() {
        return "Recomendation{" +
                "targetAudience='" + targetAudience + '\'' +
                ", books=" + books +
                '}';
    }

    public String getTargetAudience() {
        return targetAudience;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public void removeBook(Book book) {
        this.books.remove(book);
    }
}
