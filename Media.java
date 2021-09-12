import java.util.Date;

public class Media {
    private Date creationDate;
    private String title;
    private  String owner;

    public Media(Date creationDate, String title, String owner) {
        this.creationDate = creationDate;
        this.title = title;
        this.owner = owner;
    }

}
