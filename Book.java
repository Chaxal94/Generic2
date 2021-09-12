import java.util.Date;

public class Book extends Media {
    private int pageCount;
    public Book(Date creationDate, String title, String owner,int pageCount) {
        super(creationDate, title, owner);
        this.pageCount = pageCount;

    }
}
