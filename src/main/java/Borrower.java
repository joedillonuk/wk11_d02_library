import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }

    public int countCollection(){
        return collection.size();
    }

    public void getBookFromLibrary(Library library){
        Book book = library.removeBook();
        collection.add(book);
    }

}
