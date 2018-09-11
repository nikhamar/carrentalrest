import java.util.List;
import java.util.Map;
import java.util.Set;

public class Book {

//    private List<String> booknames;
//     Set<String> booknames;
    Map<String, String> booknames;


    public Book(Map<String, String> booknames){
    this.booknames=booknames;

}

    public Map<String, String> getBooknames() {
        return booknames;
    }

    public void setBooknames(Map<String, String> booknames) {
        this.booknames = booknames;
    }
}
