import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int maxStock;

    public Library(){
        this.stock = new ArrayList<Book>();
        this.maxStock = 5;

    }

    public int stockCount(){
        return stock.size();
    }

    public void addBook(Book book){
        stock.add(book);
    }

    public ArrayList<Book> getAllStock() {
        return stock;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public boolean hasRoomInStock(){
        if(stockCount() >= getMaxStock()){
            return false;
        }
        return true;
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }
}
