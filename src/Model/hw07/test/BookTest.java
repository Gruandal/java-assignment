package Model.hw07.test;

import Model.hw07.Author;
import Model.hw07.Book;
import Model.hw07.Publisher;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        Author[] authors = {new Author("John", "Doe"), new Author("Jane", "Smith")};
        Publisher publisher = new Publisher("ABC Publishing", "123 Main St.");
        Date publishingDate = new Date(1234567890);
        book = new Book("Book1", "123456789", authors, publisher, publishingDate);
    }

    @Test
    public void testGetBookName() {
        assertEquals("Book1", book.getBookName());
    }

    @Test
    public void testGetIsbn() {
        assertEquals("123456789", book.getIsbn());
    }

    @Test
    public void testGetAuthors() {
        assertEquals(2, book.getAuthors().length);
        assertEquals("John", book.getAuthors()[0].firstname);
        assertEquals("Doe", book.getAuthors()[0].lastname);
        assertEquals("Jane", book.getAuthors()[1].firstname);
        assertEquals("Smith", book.getAuthors()[1].lastname);
    }

    @Test
    public void testGetPublisher() {
        assertEquals("ABC Publishing", book.getPublisher().corp);
        assertEquals("123 Main St.", book.getPublisher().address);
    }

    @Test
    public void testGetPublishingDate() {
        assertEquals(1234567890, book.getPublishingDate().getTime());
    }
}
