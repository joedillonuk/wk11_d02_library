import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Integer> genreTotal(){
        HashMap<String, Integer> genreTotal = new HashMap<String, Integer>();
        for(int index = 0; index < stockCount(); index++){
            String genre;
            genre = this.stock.get(index).getGenre();
            if(genreTotal.containsKey(genre)){
                genreTotal.put(genre, genreTotal.get(genre) + 1);
            }else {
                genreTotal.put(genre, 1);
            }
        }
        return genreTotal;
    }
}
