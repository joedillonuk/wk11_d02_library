import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1, book2, book3;

    @Before
    public void before(){
        borrower = new Borrower("Arrietty");
        library = new Library();
        book1 = new Book("Revenge of the Lawn", "Richard Brautigan", "Short Stories");
        book2 = new Book("A Small, Good Thing", "Raymond Carver", "Short Stories");
        book3 = new Book("Catch-22", "Joseph Heller", "Dark Comedy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void canTakeBookFromLibrary(){
        borrower.getBookFromLibrary(library);
        assertEquals(1, borrower.countCollection());
    }
}
