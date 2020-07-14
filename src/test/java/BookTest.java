import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Revenge of the Lawn", "Richard Brautigan", "Short Stories");
    }

    @Test
    public void testBookHasName(){
        assertEquals("Revenge of the Lawn", book.getName());
    }

    @Test
    public void testBookHasAuthor(){
        assertEquals("Richard Brautigan", book.getAuthor());
    }

    @Test
    public void testBookHasGenre(){
        assertEquals("Short Stories", book.getGenre());
    }
}
