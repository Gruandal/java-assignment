package Model.hw07;

import java.util.Arrays;
import java.util.Date;

public class Book {
    private String bookName;
    private String isbn;
    private Author[] authors;
    private Publisher publisher;
    private Date publishingDate;

    public Book(String bookName, String isbn, Author[] authors, Publisher publisher, Date publishingDate) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingDate = publishingDate;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", publishingDate=" + publishingDate +
                '}';
    }
}
