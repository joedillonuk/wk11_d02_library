import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1, book2, book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Revenge of the Lawn", "Richard Brautigan", "Short Stories");
        book2 = new Book("A Small, Good Thing", "Raymond Carver", "Short Stories");
        book3 = new Book("Catch-22", "Joseph Heller", "Dark Comedy");
    }

    @Test
    public void checkStockStartsEmpty(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void hasRoomInStock_True(){
        assertEquals(true, library.hasRoomInStock());
    }

    @Test
    public void hasRoomInStock_False(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(false, library.hasRoomInStock());
    }

    @Test
    public void genreTotalReturnsSomething(){
        library.addBook(book1);

        assertEquals(2, library.genreTotal());
    }


}
